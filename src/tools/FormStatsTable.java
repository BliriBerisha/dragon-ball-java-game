package tools;

import java.util.ArrayList;
import java.util.List;

import characters.Fighter;
import transformations.Transformations;

public final class FormStatsTable {

    private static final class Row {
        final String type;
        final String form;
        final String hp;
        final String def;
        final String ki;
        final String pwr;
        final String atk;
        final String avgX;

        Row(String type, String form, String hp, String def, String ki, String pwr, String atk, String avgX) {
            this.type = type;
            this.form = form;
            this.hp = hp;
            this.def = def;
            this.ki = ki;
            this.pwr = pwr;
            this.atk = atk;
            this.avgX = avgX;
        }

        String[] cells() {
            return new String[] { type, form, hp, def, ki, pwr, atk, avgX };
        }
    }

    private FormStatsTable() {
    }

    public static void printFor(Fighter fighter) {
        List<Row> rows = buildRows(fighter);
        printTable("Forms for " + fighter.getName() + " (stats derived from base)",
                new String[] { "TYPE", "FORM", "HP", "DEF", "KI", "PWR", "ATK", "AVGx" }, rows);
    }

    private static List<Row> buildRows(Fighter fighter) {
        List<Row> rows = new ArrayList<>();

        // Base row
        rows.add(new Row(
            "-",
                "Base",
                fmtStat(fighter.getBaseHP()),
                fmtStat(fighter.getBaseDEFENSE()),
                fmtStat(fighter.getBaseKI()),
                fmtStat(fighter.getBasePOWER()),
                fmtStat(fighter.getBaseATTACK()),
                fmtMultiplier(1.0)));

        for (Transformations t : fighter.getForms()) {
            double hpM = t.getHPmultiplier();
            double defM = t.getDEFENSEmultiplier();
            double kiM = t.getKImultiplier();
            double pwrM = t.getPOWERmultiplier();
            double atkM = t.getATTACKmultiplier();

            double avg = (hpM + defM + kiM + pwrM + atkM) / 5.0;

            String type = t.getClass().getSimpleName();
            String form = t.getName() + " " + t.getFormINDEX();

            rows.add(new Row(
                    type,
                    form,
                    fmtStat(fighter.getBaseHP() * hpM),
                    fmtStat(fighter.getBaseDEFENSE() * defM),
                    fmtStat(fighter.getBaseKI() * kiM),
                    fmtStat(fighter.getBasePOWER() * pwrM),
                    fmtStat(fighter.getBaseATTACK() * atkM),
                    fmtMultiplier(avg)));
        }

        return rows;
    }

    private static String fmtStat(double value) {
        // keep it clean for cmd; most of your base stats are whole numbers
        if (Math.abs(value - Math.rint(value)) < 1e-9) {
            return String.format("%.0f", value);
        }
        return String.format("%.2f", value);
    }

    private static String fmtMultiplier(double value) {
        return String.format("%.2f", value);
    }

    private static void printTable(String title, String[] headers, List<Row> rows) {
        List<String[]> matrix = new ArrayList<>();
        matrix.add(headers);
        for (Row row : rows) {
            matrix.add(row.cells());
        }

        int cols = headers.length;
        int[] widths = new int[cols];

        for (String[] r : matrix) {
            for (int c = 0; c < cols; c++) {
                widths[c] = Math.max(widths[c], r[c].length());
            }
        }

        String border = buildBorder(widths);

        System.out.println();
        System.out.println(title);
        System.out.println(border);
        System.out.println(buildRow(headers, widths));
        System.out.println(border);
        for (int i = 1; i < matrix.size(); i++) {
            System.out.println(buildRow(matrix.get(i), widths));
        }
        System.out.println(border);
        System.out.println();
    }

    private static String buildBorder(int[] widths) {
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        for (int w : widths) {
            sb.append(repeat('-', w + 2));
            sb.append('+');
        }
        return sb.toString();
    }

    private static String buildRow(String[] cells, int[] widths) {
        StringBuilder sb = new StringBuilder();
        sb.append('|');
        for (int i = 0; i < cells.length; i++) {
            sb.append(' ');
            sb.append(padRight(cells[i], widths[i]));
            sb.append(' ');
            sb.append('|');
        }
        return sb.toString();
    }

    private static String padRight(String s, int width) {
        if (s.length() >= width) {
            return s;
        }
        return s + repeat(' ', width - s.length());
    }

    private static String repeat(char ch, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

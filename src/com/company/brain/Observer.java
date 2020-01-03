package com.company.brain;

public class Observer {
    private static char checkLine(char[][] field) {
        for (char[] line : field) {
            char control = line[0];
            int counter = 1;
            for (int i = 1; i < field.length; i++) {
                if (line[i] == control) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter == field.length) {
                return control;
            }
        }
        return ' ';
    }

    private static char checkRow(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            int counter = 1;
            char control = field[0][i];
            for (int j = 1; j < field.length; j++) {
                if (control == field[j][i]) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter == field.length) {
                return control;
            }
        }
        return ' ';
    }

    private static char checkDiagonal(char[][] field) {
        int counter = 1;
        char control = field[0][0];
        for (int i = 1; i < field.length; i++) {
            if (control == field[i][i]) {
                counter++;
            } else {
                break;
            }
        }
        if (counter == field.length) {
            return control;
        }
        counter = 1;
        control = field[0][field.length - 1];
        for (int i = 1, j = field.length - 2; i < field.length; i++, j--) {
            if (control == field[i][j]) {
                counter++;
            } else {
                break;
            }
        }
        if (counter == field.length) {
            return control;
        }
        return ' ';
    }

    public static char checkAll(char[][] field) {
        char line = checkLine(field);
        if (line != ' ') {
            return line;
        }
        char row = checkRow(field);
        if (row != ' ') {
            return row;
        }
        return checkDiagonal(field);
    }
}

package com.company.brain;

import com.company.field.Field;

public class Observer {
    public static int[][] emptySpots(char[][] field) {
        int[][] temp = new int[field.length * field.length][];
        int counter = 0;
        for (int row = 0; row < field.length; row++) {
            for (int element = 0; element < field.length; element++) {
                if (field[row][element] == ' ') {
                    temp[counter++] = new int[]{row, element};
                }
            }
        }
        if (counter > 0) {
            int[][] result = new int[counter][];
            System.arraycopy(temp, 0, result, 0, counter);
            return result;
        } else {
            return new int[][]{{-1, -1}};
        }
    }

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
        char diagonal = checkDiagonal(field);
        if (diagonal != ' ') {
            return diagonal;
        }
        for (char[] part : field) {
            for (char el : part) {
                if (el == ' ') {
                    return ' ';
                }
            }
        }
        return '?';
    }

    static boolean checkCoordinatesFree(int[] coordinates) {
        int[][] freeSpots = Observer.emptySpots(Field.getMainField());
        for (int[] part : freeSpots) {
            if (coordinates[0] == part[0] && coordinates[1] == part[1]) {
                return true;
            }
        }
        return false;
    }
}

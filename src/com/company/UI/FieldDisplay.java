package com.company.UI;

public class FieldDisplay {
    public static void show(char[][] field) {
        System.out.println();
        System.out.print("    ");
        for (int i = 1; i <= field.length; i++) {
            if (i < 10) {
                System.out.print(" " + i + "  ");
            } else {
                System.out.print(" "+ i + " ");
            }
        }
        System.out.println();
        for (int row = 0; row < field.length; row++) {
            System.out.print((char)(row+97)+" ");
            for (int element = 0; element < field.length; element++) {
                System.out.print(" | "+field[row][element]);
            }
            System.out.print(" |");
            System.out.println();
        }
    }
}

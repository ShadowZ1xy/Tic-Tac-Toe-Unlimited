package com.company.players;

import java.util.Scanner;

public class PlayerChoice {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] convertCoordinate(String choice) {
        int row = choice.charAt(0) - 97;
        int element;
        if (choice.length() == 3) {
            String elementString = choice.charAt(1) + "" + choice.charAt(2);
            element = Integer.parseInt(elementString);
            element--;
        } else {
            element = choice.charAt(1);
            element -= 49;
        }
        return new int[]{row, element};
    }

    public static String askChoice() {
        System.out.println();
        System.out.print("Type your choice (like a 'a2'): ");
        return scanner.nextLine();
    }
}

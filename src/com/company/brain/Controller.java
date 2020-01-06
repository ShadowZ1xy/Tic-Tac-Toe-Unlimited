package com.company.brain;

import com.company.players.Player;
import com.company.players.PlayerChoice;

public class Controller {
    public static void playerMove(Player human, char[][] field) {
        while (true) {
            String askChoice = PlayerChoice.askChoice();
            int[] choiceCoordinates = PlayerChoice.convertCoordinate(askChoice);
            if (choiceCoordinates[0] < field.length && choiceCoordinates[1] < field.length) {
                if (Observer.checkCoordinatesFree(choiceCoordinates)) {
                    human.move(choiceCoordinates, field);
                    return;
                } else {
                    System.out.println("Wrong coordinates, try again.");
                }
            } else {
                System.out.println("Wrong coordinates, try again.");
            }
        }
    }


}

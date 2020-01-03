package com.company.brain;

import com.company.PlayerChoice;
import com.company.players.Human;

public class Controller {
    public static void playerMove(Human human, char[][] field) {
        while (true) {
            String askChoice = PlayerChoice.askChoice();
            int[] choiceCoordinates = PlayerChoice.convertCoordinate(askChoice);
            if (choiceCoordinates[0] < field.length && choiceCoordinates[1] < field.length) {
                human.move(choiceCoordinates, field);
                return;
            } else {
                System.out.println("Wrong coordinates, try again.");
            }
        }
    }
}

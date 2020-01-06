package com.company;

import com.company.UI.FieldDisplay;
import com.company.brain.AI.Computer;
import com.company.brain.Controller;
import com.company.brain.Observer;
import com.company.field.Field;
import com.company.players.Player;

class Init {
    static void start() {
        Player human = new Player();
        Player bot = new Player();
        human.setFigure('X');
        bot.setFigure('O');
        Field.init(3);
        while (true) {
            FieldDisplay.show(Field.getMainField());
            Controller.playerMove(human, Field.getMainField());
            FieldDisplay.show(Field.getMainField());
            if (Observer.checkAll(Field.getMainField()) != ' ') {
                break;
            }

            bot.move(Computer.bestMove(
                    Field.getMainField(),
                    bot.getFigure(),
                    human.getFigure()),
                    Field.getMainField()
            );
            FieldDisplay.show(Field.getMainField());
            if (Observer.checkAll(Field.getMainField()) != ' ') {
                break;
            }

        }
    }
}

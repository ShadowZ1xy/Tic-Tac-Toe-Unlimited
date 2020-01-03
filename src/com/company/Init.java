package com.company;

import com.company.UI.FieldDisplay;
import com.company.brain.Observer;
import com.company.brain.Controller;
import com.company.field.Field;
import com.company.players.Human;

public class Init {
    public static void start() {
        /*System.out.println(Arrays.toString(PlayerChoice.convertCoordinate("c15")));*/
        Human human = new Human();
        //human.move(new int[]{0, 0}, Field.getMainField());
        human.setFigure('X');
        Field.init(3);
        FieldDisplay.show(Field.getMainField());
        Controller.playerMove(human, Field.getMainField());
        FieldDisplay.show(Field.getMainField());
        System.out.println();
        System.out.println(Observer.checkAll(Field.getMainField()));
    }
}

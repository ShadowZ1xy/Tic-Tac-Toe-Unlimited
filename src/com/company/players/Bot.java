package com.company.players;

import com.company.players.interfaces.BotInterface;

public class Bot extends PlayerParent implements BotInterface {



    @Override
    public void move(int[] choice, char[][] field) {

    }

    @Override
    public int[] generateMove(char[][] field) {
        return new int[0];
    }
}

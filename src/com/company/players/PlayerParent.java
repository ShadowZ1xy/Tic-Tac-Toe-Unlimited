package com.company.players;

public abstract class PlayerParent {
    int win = 0;
    int lose = 0;
    int toe = 0;
    char figure;

    public void move(int[] choice, char[][] field) {
        field[choice[0]][choice[1]] = this.figure;
    }
}

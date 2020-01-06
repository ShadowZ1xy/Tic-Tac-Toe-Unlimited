package com.company.players;

public class Player {
    int win = 0;
    int lose = 0;
    int toe = 0;
    private char figure;

    public void move(int[] choice, char[][] field) {
        field[choice[0]][choice[1]] = this.figure;
    }

    public char getFigure() {
        return figure;
    }

    public void setFigure(char figure) {
        this.figure = figure;
    }
}

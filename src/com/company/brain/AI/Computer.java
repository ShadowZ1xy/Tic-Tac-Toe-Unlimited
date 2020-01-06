package com.company.brain.AI;

import com.company.brain.Observer;

public class Computer {
    public static int[] bestMove(char[][] field, char ai, char human) {
        int bestScore = (int) Double.NEGATIVE_INFINITY;
        int[] move = new int[0];
        int[][] emptySpots = Observer.emptySpots(field);
        for (int[] part : emptySpots) {
            field[part[0]][part[1]] = ai;
            int score = miniMax(
                    field, false,
                    ai, human,
                    (int) Double.NEGATIVE_INFINITY,
                    (int) Double.POSITIVE_INFINITY
            );
            field[part[0]][part[1]] = ' ';
            if (score > bestScore) {
                bestScore = score;
                move = part;
            }
        }
        return move;
    }

    private static int miniMax(char[][] field, boolean isMax,
                               char ai, char human,
                               int alpha, int beta) {
        char result = Observer.checkAll(field);
        if (result != ' ') {
            if (result == ai) {
                return 10;
            } else if (result == human) {
                return -10;
            } else {
                return 0;
            }
        }
        int bestScore;
        int[][] emptySpots = Observer.emptySpots(field);
        if (isMax) {
            bestScore = (int) Double.NEGATIVE_INFINITY;
            for (int[] part : emptySpots) {
                field[part[0]][part[1]] = ai;
                int score = miniMax(field, false, ai, human, alpha, beta);
                field[part[0]][part[1]] = ' ';
                bestScore = Math.max(score, bestScore);
                alpha = Math.max(alpha, score);
                if (beta <= alpha) {
                    break;
                }
            }
            return bestScore;
        } else {
            bestScore = (int) Double.POSITIVE_INFINITY;
            for (int[] part : emptySpots) {
                field[part[0]][part[1]] = human;
                int score = miniMax(field, true, ai, human, alpha, beta);
                field[part[0]][part[1]] = ' ';
                bestScore = Math.min(score, bestScore);
                beta = Math.min(beta, score);
                if (beta <= alpha) {
                    break;
                }
            }
            return bestScore;
        }

    }
}

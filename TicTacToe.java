package ru.geekbraims.lesson_4;

//import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static void start() {
        char[][] field = createField();
        drawField(field);

        while (true) {
            doPlayerMove(field);
            if (isWin(field, 'X') || isDraw(field)) {
                break;
            }

            doAIMove(field);
            if (isWin(field, '0') || isDraw(field)) {
                break;
            }

        }
    }

    static boolean isWin(char[][] field, char sign) {
        boolean right_diagonal, left_diagonal; // right & left diagonals
        right_diagonal = true; //set up boolean (logic) value
        left_diagonal = true;

        for (int i = 0; i < field.length; i++) {
            right_diagonal = right_diagonal && field[i][i] == sign;
            left_diagonal &= field[field.length - i - 1][i] == sign; // brief entry
        }
        if (right_diagonal || left_diagonal) {
            return true;
        }
        // horizontal
        for (char[] chars : field) {
            if (chars[0] == sign && chars[1] == sign && chars[2] == sign &&
                    chars[3] == sign && chars[4] == sign) {
                return true;
            }
        }
        // vertical
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign &&
                    field[2][i] == sign && field[3][i] == sign && field[4][i] == sign) {
                return true;
            }
        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (isCellFree(field, i, j)) {
                    return false;
                }

            }

        }
        return true;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(field.length);
            col = random.nextInt(field.length);
        } while (isCellOccupied(field, row, col));

        field[row][col] = '0';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int row;
        int col;

        do {
            System.out.println("Please, input coordinates... ");
            row = getCoordinate("row");
            col = getCoordinate("col");
        } while (isCellOccupied(field, row, col));

        field[row][col] = 'X';
        drawField(field);
    }

    static boolean isCellFree(char[][] field, int row, int col) {
        return !isCellOccupied(field, row, col);
    }

    static boolean isCellOccupied(char[][] field, int row, int col) {
        return field[row][col] != '-';
    }

    static int getCoordinate(String coordType) {
        Scanner scanner = new Scanner(System.in);
        int coord;

        do {
            System.out.printf("Please, input %s-coordinate [1-5]...%n", coordType);
            coord = scanner.nextInt() - 1;

        } while (coord < 0 || coord >= 5);

        return coord;
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},

        };
    }

    static void drawField(char[][] field) {
        for (char[] chars : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(chars[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}


package ru.geekbrains.lesson2;

import java.util.Arrays;

public class MyHomeWorkApp {


    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
       int[][] drawDiagonal = getFillDiagonal();
        iterateOverArray(drawDiagonal);
        System.out.println(Arrays.toString(myMethod(4,6)));
    }

    /*
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * */

    static void invertArray() {
        {
            System.out.println("TASK_1");
        }
        {
            System.out.println("Массив [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ] с помощью цикла и условия заменить 0 на 1, 1 на 0;");
        }
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        {
            int i = 0;
            while (i < arr.length) {
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            {
                System.out.print(arr[i] + " ");
            }

        }
        {
            System.out.println("END");
        }
    }
    /*
     *  Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     * */

    static void fillArray() {
        {
            System.out.println("TASK_2");
        }
        {
            System.out.println("Задать пустой целочисленный массив длиной 100. " +
                    "С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;");
        }
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

        {
            System.out.println("END");
        }
    }

    /*
     *Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * */

    static void changeArray() {
        {
            System.out.println("TASK_3");
        }
        {
            System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] " +
                    "пройти по нему циклом, и числа меньше 6 умножить на 2;");
        }
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            {
                System.out.print(arr[i] + " ");
            }
        }
        {
            System.out.println("END");
        }
    }

    /*
    *Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     если обе сложно). Определить элементы одной из диагоналей можно
      по следующему принципу: индексы таких элементов равны,
      то есть [0][0], [1][1], [2][2], …, [n][n];
     */


    static int[][] getFillDiagonal() {
        {
            System.out.println("TASK4");
        }
        {
            System.out.println("Создать квадратный двумерный целочисленный массив\n" +
                    "и с помощью цикла(-ов)\n" +
                    "заполнить его диагональные элементы единицами ");
        }

        return new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };

    }

    static void iterateOverArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0, x = numbers[i].length - 1; j < numbers[i].length; j++) {
                if (i == j || i == x - 1) {
                    numbers[i][j] = 1;
                    numbers[i][numbers[i].length - 1 - i] = 1;
                }
                System.out.print(numbers[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("END");
    }
/*
*  Написать метод, принимающий на вход два аргумента:
* len и initialValue, * и возвращающий одномерный массив
* типа int длиной len, каждая ячейка которого равна initialValue;
* */
       public static int[] myMethod (int len, int initialValue) {
           System.out.println("TASK_5");
           System.out.println("Написать метод, принимающий на вход два аргумента:\n" +
                   "len и initialValue, и возвращающий одномерный массив\n" +
                   "типа int длиной len, каждая ячейка которого равна initialValue; ");

            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = initialValue;
            }
           return result;
        }


}






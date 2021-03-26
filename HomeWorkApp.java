package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    private static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    private static void checkSumSign() {
        int a = 8, b = -9, c;
        c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительная ");
        }
        else  {
            System.out.println("сумма отрицательная ");
        }
    }

    private static void printColor() {
          int value = 120 ;

          if (value <= 0) {
              System.out.println("Красный ");
          } else if (value > 0  && value <= 100) {
              System.out.println("Желтый ");
          } else {
              System.out.println("Зеленый ");
          }
    }
    private static void compareNumbers() {
        int a = 37, b = 78;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}








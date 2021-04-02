package ru.geekbrains.lesson_3;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        System.out.println(checkTwoFigures());
        verifyInteger();
        System.out.println(returnMinusTrue());
        doPrintLines();
        System.out.println(doDetermineYear());
    }

    /* Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false. * */

    static boolean checkTwoFigures() {
        int a = 7;
        int b = 9;

            return (10 <= a + b) && (a + b <= 20);

        }
/* Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом. * */

    static void verifyInteger() {
        int a = 8;
        if (a >= 0) {
            System.out.println("Число " + a + " " + "положительное");
        } else {
            System.out.println("Число " + a + " " + "отрицательное ");
        }

    }


/*  Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное, и вернуть false если положительное.
* */

    static boolean returnMinusTrue(){
        int a = -7;
        return a < 0;

    }

    /*  Написать метод, которому в качестве аргументов передается строка и число, метод должен
    отпечатать в консоль указанную строку, указанное количество раз;
    * */

    static void doPrintLines() {
        int[] numbers = new int[5];

        for (int number : numbers) {
            System.out.printf(" Print Line %n", number);
        }

        }







    /* Написать метод, который определяет, является ли год високосным, и возвращает boolean
      (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
       каждого 100-го, при этом каждый 400-й – високосный.
    * */

    static boolean doDetermineYear(){
        int year = 100;

        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);

    }




    }




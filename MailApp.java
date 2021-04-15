package ru.geekbrains.lesson6_animals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MailApp {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 200;
        double distanceSwim = Math.random() * 0;

        Animal cat = new Cat("Кот Базилио ", distanceRun, distanceSwim);

        distanceRun = Math.random() * 500;
        distanceSwim = Math.random() * 10;

        Animal dog = new Dog("Спаниель ", distanceRun, distanceSwim);

        System.out.println("Введите дистанцию для бега ");

        double distance = scanner.nextDouble();

        System.out.printf("%s пробежал: %s\n", cat.getId(), cat.run(distance));

        System.out.printf("%s пробежал: %s\n\n", dog.getId(), dog.run(distance));

        System.out.println("Введите дистанцию для плавания ");

        distance = scanner.nextDouble();

        System.out.printf("%s проплыл: %s\n", cat.getId(), cat.swim(distance));

        System.out.printf("%s проплыл: %s\n\n", dog.getId(), dog.swim(distance));
    }
}

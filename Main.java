package ru.geekbrains.lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Егор Бероев", "Ведущий разработчик ", "egor@mail.ru",
                        "+79231452267", 170000, 47),
                new Employee("Иван Петров", "Инженер ", "ghytrr.er@mail.ru",
                        "+79745652267", 168000, 43),
                new Employee("Максим Суворов", "Инженер ", "emax.kjr@mail.ru",
                        "+79531458267", 1680000, 39),
                new Employee("Илья Серов", "Ведущий разработчик ", "serov.br@mail.ru",
                        "+79334572267", 170000, 44),
                new Employee("Петр Терин", "Инженер ", "petrtr.tr@mail.ru",
                        "+79245782267", 1680000, 35),

        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }

        }
    }
}

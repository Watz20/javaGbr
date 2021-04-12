package ru.geekbrains.lesson_5;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    // it's a constructor
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    //  Переопределенный метод
    @Override
    public String toString() {
        return String.format("Имя: %s \t Должность: %s  \n email: %s \t Номер телефона: %s \n Зарплата: %d  \t Возраст: %d ",
                name, position, email, phone_number, salary, age);
    }

}


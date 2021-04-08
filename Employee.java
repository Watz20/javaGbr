package ru.geekbrains.lesson_5;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String name;
    String position;
    private String email;
    private String phone_number;
    private int salary;
    int age;

    // it's a constructor
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    //  Переопределенный метод
    @Override
    public String toString() {
        return String.format("Имя: %s \t Должность: %s  \n email: %s \t Номер телефона: %s \n Зарплата: %d  \t Возраст: %d ",
                name, position, email, phone_number, salary, age);
    }

    // метод вывода в консоль
    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Егор Бероев", "Ведущий разработчик ", "egor@mail.ru",
                "+79231452267", 170000, 47);
        persArray[1] = new Employee("Иван Петров", "Инженер ", "ghytrr.er@mail.ru",
                "+79745652267", 168000, 43);
        persArray[2] = new Employee("Максим Суворов", "Инженер ", "emax.kjr@mail.ru",
                "+79531458267", 1680000, 40);
        persArray[3] = new Employee("Илья Серов", "Ведущий разработчик ", "serov.br@mail.ru",
                "+79334572267", 170000, 44);
        persArray[4] = new Employee("Петр Терин", "Инженер ", "petrtr.tr@mail.ru",
                "+79245782267", 1680000, 35);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Employee employee : persArray) {
            if (employee.age > 40) employee.print();
        }
    }
}

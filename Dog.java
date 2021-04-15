package ru.geekbrains.lesson6_animals;

public class Dog extends Animal {

    public Dog(String id, double distanceRun, double distanceSwim) {
        super(id);
    }

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 500);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }

}

package ru.geekbrains.lesson6_animals;

public class Cat extends Animal {

    public Cat(String id, double distanceRun, double distanceSwim) {
        super(id);
    }

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}



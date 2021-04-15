package ru.geekbrains.lesson6_animals;

public abstract class Animal {

    private String id;

    public Animal(String id) {
        this.id = id;
    }

    public Animal() {

    }

    public String getId() {
        return id;
    }

    public abstract boolean run(double run);

    public abstract boolean swim(double swim);

}


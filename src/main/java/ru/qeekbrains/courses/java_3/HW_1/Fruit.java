package ru.qeekbrains.courses.java_3.HW_1;

abstract class Fruit {
    protected float weight;

    public abstract Fruit newInstance();

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

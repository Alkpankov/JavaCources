package ru.qeekbrains.courses.java_3.HW_1;

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }
    @Override
    public Fruit newInstance() {
        return new Apple();
    }
}

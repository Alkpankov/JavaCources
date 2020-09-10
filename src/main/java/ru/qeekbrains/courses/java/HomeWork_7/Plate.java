package ru.qeekbrains.courses.java.HomeWork_7;

public class Plate {
    private int food;

    public Plate(int foot) {
        this.food = foot;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int appetite) {
        if (this.food>= appetite) {
            this.food -= appetite;
            System.out.println("This cat ate!");
            return true;
        } else {
            System.out.println("This cat lacks food!");
            return false;
        }
    }

    public void addEat(int eat) {
        this.food += eat;
    }
}

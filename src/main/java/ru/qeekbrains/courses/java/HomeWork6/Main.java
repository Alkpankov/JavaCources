package ru.qeekbrains.courses.java.HomeWork6;

public class Main {
    public static void main(String[] args) {
        Animal barsic = new Cat("barsic", "red", 3);
        Animal borziy = new Dog("Borziy", "White", 5);
        Animal kot = new Cat("Hmuriy", "Black", 2, 300, 2.5);
        Animal pes = new Dog("Shalnoy", "Orange", 4, 700, 30, 1.5);
        Animal duck = new Animal("Utka", "White", 2);

        barsic.run(10);
        barsic.run(300);
        System.out.println("---------");
        barsic.bounce(1.5);
        barsic.bounce(3);
        System.out.println("---------");
        barsic.swiming(10);
        System.out.println("---------");
        kot.run(300);
        kot.bounce(2.5);
        kot.swiming(10);
        System.out.println("---------");
        borziy.run(250);
        borziy.run(600);
        System.out.println("---------");
        borziy.bounce(0.25);
        borziy.bounce(0.7);
        System.out.println("---------");
        borziy.swiming(5);
        borziy.swiming(15);
        System.out.println("---------");
        pes.run(650);
        pes.bounce(1);
        pes.swiming(20);
        System.out.println("---------");
        System.out.println("---------");
        duck.run(10000);
        duck.bounce(500);
        duck.swiming(1000);
    }
}

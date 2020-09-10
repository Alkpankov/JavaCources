package ru.qeekbrains.courses.java.HomeWork_7;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = new Cat[10];
        Plate plate = new Plate(50);
        plate.info();
        int i = 0;
        while(i<10){
            cats[i] = new Cat (("Name"+String.valueOf(i)), (int) (25 * Math.random()));
            i++;
        }

            for (Cat a : cats) {
                a.eat(plate);
            }
        System.out.println("--------");
        for (Cat a : cats) {
            System.out.println(a.getName() + " satiety: " + a.isHunger());
        }
        System.out.println("--------");

        plate.addEat(50);
        plate.info();
        for (Cat a : cats) {
            a.eat(plate);
        }
        System.out.println("--------");
        for (Cat a : cats) {
            System.out.println(a.getName() + " satiety: " + a.isHunger());
        }
        plate.info();
    }
}

package ru.qeekbrains.courses.java.HomeWork6;

public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run (int distance){
        System.out.println(" Animal runing to " + distance + " m");
    }

    public void swiming (int distance){
        System.out.println(" Animal swiming to " + distance + " m");
    }

    public void bounce ( double height){
        System.out.println(" Animal jump to " + height + " m");
    }
}

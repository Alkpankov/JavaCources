package ru.qeekbrains.courses.java.HomeWork6;

public class Cat extends Animal {
    private String name;
    private String color;
    private int age;
    private  int distanceRun;
    private  double jumpHeight;

    public Cat (String name, String color, int age){
        super(name, color, age);
        this.distanceRun = 200;
        this.jumpHeight = 2;
    }

    public Cat (String name, String color, int age, int distanceRun, double jumpHeight){
        super(name, color, age);
        this.distanceRun = distanceRun;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= distanceRun) {
            System.out.println( "Cat run to " + distance + " m" );
        } else {
            System.out.println( "Cat don't runing this distance!" );
        }
    }

    @Override
    public void bounce(double height) {
        if (height <= jumpHeight) {
            System.out.println( "Cat jump to " + height + " m" );
        } else {
            System.out.println( "Cat don't jump this distance!" );
        }
    }

    @Override
    public void swiming(int distance) {
        System.out.println("Cat can't swim");
    }
}

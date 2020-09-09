package ru.qeekbrains.courses.java.HomeWork6;

public class Dog extends Animal {
    private String name;
    private String color;
    private int age;
    private  int distanceRun;
    private  int distanceSwim;
    private  double jumpHeight;

    public Dog (String name, String color, int age){
        super(name, color, age);
        this.distanceRun = 500;
        this.distanceSwim = 10;
        this.jumpHeight = 0.5;
    }

    public Dog (String name, String color, int age, int distanceRun, int distanceSwim, double jumpHeight){
        super(name, color, age);
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= distanceRun) {
            System.out.println( "Dog run to " + distance + " m" );
        } else {
            System.out.println( "Dog can't runing this distance!" );
        }
    }

    @Override
    public void bounce(double height) {
        if (height <= jumpHeight) {
            System.out.println( "Dog jump to " + height + " m" );
        } else {
            System.out.println( "Dog can't jump this distance!" );
        }
    }

    @Override
    public void swiming(int distance) {
        if (distance <= distanceSwim) {
            System.out.println( "Dog swiming to " + distance + " m" );
        } else {
            System.out.println( "Dog can't swiming this distance!" );
        }
    }
}


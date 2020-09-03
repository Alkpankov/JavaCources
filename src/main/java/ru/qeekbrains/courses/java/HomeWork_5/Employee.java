package ru.qeekbrains.courses.java.HomeWork_5;


public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;



    public Employee (String fullName, String position, String eMail, String phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee (){
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность: " + this.position);
        System.out.println("eMail: " + this.eMail);
        System.out.println("Номер телефона: " + this.phoneNumber);
        System.out.println("Заработная плата: " + this.salary + " тысяч рублей");
        System.out.println("Возраст: " + this.age + " лет");
    }

    public int getAge() {
        return this.age;
    }



}

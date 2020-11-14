package ru.qeekbrains.courses.java_2.HomeWork_3;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook man = new PhoneBook();
        man.add("God", "777");
        man.add("Ivanov", "888");
        man.add("Petrov", "7843");
        man.add("Sidorov", "64681");
        man.add("Ivanov", "888999");
        man.add("Kuznecov", "374384");
        man.add("Goncharovcky", "6546");
        man.add("Ivanov", "878");
        man.get("Ivanov");
        System.out.println("-----------");
        man.get("God");
        System.out.println("-----------");
        man.get("Hoold");
    }
}

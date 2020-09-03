package ru.qeekbrains.courses.java.HomeWork_5;


public class Main {

    public static void main(String[] args) {
        Employee [] persArray = new Employee[5];
        persArray [0] = new Employee("Вася А.И.", "Монтажник", "vasil@mail.ru", "+79885532266", 50, 18);
        persArray [1] = new Employee("Петя Б.Б.", "Директор", "petr@mail.ru", "+79885532266", 100, 60);
        persArray [2] = new Employee("Саша К.И.", "Секретарь", "sasha@mail.ru", "+79885532266", 40, 20);
        persArray [3] = new Employee("Даня Л.М.", "Зам директора", "danil@mail.ru", "+79885532266", 70, 30);
        persArray [4] = new Employee("Женя Б.П.", "HR", "jenya@mail.ru", "+79885532266", 60, 45);

        for (Employee employee : persArray) {
           if (40 < employee.getAge()) {
               employee.printEmployee();
           }
        }

    }

}

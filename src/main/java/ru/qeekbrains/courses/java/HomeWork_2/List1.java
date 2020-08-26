package ru.qeekbrains.courses.java.HomeWork_2;

public class List1 {
    public static void main(String[] args) {
        int[] i = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0};
        System.out.println("Array");
        for (Integer a : i) {
            System.out.print(a + " ");
        }
        System.out.println("");
        System.out.println("New array");
        for (Integer a : i) {
            switch (a) {
                case 0:
                    a = 1;
                    System.out.print(a + " ");
                    break;
                case 1:
                    a = 0;
                    System.out.print(a + " ");
                    break;
                default:
                    System.out.print("Eror ");
                    break;
            }
        }
    }
}

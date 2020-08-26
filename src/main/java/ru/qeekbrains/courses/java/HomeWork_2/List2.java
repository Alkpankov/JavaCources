package ru.qeekbrains.courses.java.HomeWork_2;

public class List2 {
    public static void main(String[] args) {
        int a = 0;
        int [] blArray = new int[8];
        int [] Array = {0, 3, 6, 9, 12, 15, 18, 21};
        while (a<blArray.length){
            blArray [a] = Array [a];
            System.out.print(blArray [a] + " ");
            a++;
        }
    }
}

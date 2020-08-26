package ru.qeekbrains.courses.java.HomeWork_2;

public class List3 {
    public static void main(String[] args) {
        int a = 0;
        int [] Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array");
        for (Integer c: Arr) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println("New array");
        while (a<Arr.length){
            if (Arr [a] < 6){
                Arr [a] = Arr [a] * 2;
            }
            System.out.print(Arr [a] + " ");
            a++;
        }
    }
}

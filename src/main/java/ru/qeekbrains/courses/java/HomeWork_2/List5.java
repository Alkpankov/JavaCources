package ru.qeekbrains.courses.java.HomeWork_2;

public class List5 {
    public static void main(String[] args) {
        int a = 0;
        int controlMax = Integer.MIN_VALUE;
        int controlMin = Integer.MAX_VALUE;
        int [] Array = {10, 3, 25, 56, 909, 19, 18, 1};
        while (a<Array.length) {
            if (Array [a] > controlMax){
                controlMax = Array [a];
            }
            if (Array [a] < controlMin){
                controlMin = Array [a];
            }
            a++;
        }
        System.out.println("max value " + controlMax);
        System.out.println("min value " + controlMin);
    }
}

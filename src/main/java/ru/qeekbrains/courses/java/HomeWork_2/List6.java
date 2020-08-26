package ru.qeekbrains.courses.java.HomeWork_2;

public class List6 {
    public static void main(String[] args) {
        int separator = 6;
        int [] Arr = {4, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(checkLeftOrRight(Arr, separator));
    }

    public static boolean checkLeftOrRight (int[] Arr, int separator) {
        int a = 0;
        int left = 0;
        int right = 0;
        while (a<Arr.length){
            if (a<separator){
                left = left + Arr [a];
            } else {
                right = right + Arr [a];
            }
            a++;
        }
        if (left == right){
            return true;
        } else {
            return false;
        }
    }
}

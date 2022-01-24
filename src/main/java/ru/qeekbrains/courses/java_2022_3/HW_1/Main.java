package ru.qeekbrains.courses.java_2022_3.HW_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String [] srt = {"1", "2", "3", "4", "5"};
        Integer [] int1 =  {1, 2, 3, 4, 5};
//        output(srt);
//        output(transposition(srt));
//        output(int1);
//        output(transposition(int1));
        output(srt);
        output(transformation(srt));
    }
    public static <T> T[] transposition (T... a){
        int first = (int) Math.round(Math.random()*(a.length-1));
        int last = (int) Math.round(Math.random()*(a.length-1));
        T i = a[first];
        a[first] = a[last];
        a[last] = i;
        return a;
    }
    public static <T> T output (T... a){
        System.out.println(a.getClass());
        for(int i =0; i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        return (T) a;
    }
    public static <T> ArrayList transformation(T... a){
        ArrayList arr = new ArrayList();
        for(int i =0; i<a.length;i++){
            arr.add(a[i]);
        }
        return arr;
    }
}

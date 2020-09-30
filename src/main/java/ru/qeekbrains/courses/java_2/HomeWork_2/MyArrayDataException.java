package ru.qeekbrains.courses.java_2.HomeWork_2;

public class MyArrayDataException extends RuntimeException {
    private static int i;
    private static int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public int geti (){
        return i;
    }

    public int getj (){
        return j;
    }

}

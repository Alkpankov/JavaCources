package ru.qeekbrains.courses.java.HomeWork_2;

public class List4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int [] [] table = {{0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
        System.out.println("Table");
        while (a<table.length) {
            while (b<table.length) {
                System.out.print(table [a] [b] + "  ");
                b++;
            }
            System.out.println("");
            b=0;
            a++;
        }
        System.out.println("New table");
        a=0;
        b=0;
        while (a<table.length) {
            while (b<table.length) {
                if (a == b) {
                    table [a] [b] = 1;
                }
                if (a+b == 8) {
                    table [a] [b] = 1;
                }
                System.out.print(table [a] [b] + "  ");
                b++;
            }
            b=0;
            System.out.println("");
            a++;
        }
    }
}

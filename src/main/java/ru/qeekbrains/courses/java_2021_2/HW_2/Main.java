package ru.qeekbrains.courses.java_2021_2.HW_2;

public class Main {
    public static void main(String[] args) {
        String[][] str = new String[4][4];
        filling(str);
//        str [1][2] = "Lol";

        for (String[] anArr : str) {
            for (String anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

        try {
            System.out.println(adder(str));
        } catch (MyArraySizeException e) {
            System.out.println(" Массив неверного размера");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Массив содержит символы или буквы");
            e.printStackTrace();
        }



    }

    public static int  adder(String[][] str) throws MyArraySizeException, MyArrayDataException{
        int coin = 0;
        if (str.length != 4){
            throw new MyArraySizeException("Size is incorrect!");
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    coin = Integer.parseInt(str[i][j]) + coin;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Cell(" + (i + 1) + ";" + (j + 1) + ") is incorrect");
                }
            }
        }
        return coin;
    }


    public static void filling (String[][] str){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = String.valueOf(j + i*2 + 1);
            }
        }
    }
}

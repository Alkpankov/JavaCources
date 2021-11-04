package ru.qeekbrains.courses.java_2021_2.HW_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//    stringToList();
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.add("Pankov", "0078");
    phoneBook.add("Petrov", "053");
    phoneBook.add("Ivanov", "125");
    phoneBook.add("Sidorov", "624");
    phoneBook.add("Ivanov", "123");
    phoneBook.add("Pankov", "834");
    phoneBook.add("Sidorov", "035");
    phoneBook.add("Sidorov", "693");
    phoneBook.add("Remizov", "375");
    phoneBook.add("Seledkin", "762");
    phoneBook.get("Pankov");
    phoneBook.get("Sidorov");
    phoneBook.get("Seledkin");
    phoneBook.get("Ivanov");
    }
    public static void stringToList(){
        String[] strings = new String[15];
        for (int i=0;i< strings.length;i++){
            strings[i]= "Arr" + Math.round(Math.random()*3);
        }

        ArrayList list = new ArrayList();

        for (int i = 0; i<strings.length;i++){
            if (!list.contains(strings[i])){
                list.add(strings[i]);
            }
        }

        for (int i = 0; i< list.size();i++){
            int count = 0;
            for (int j = 0; j< strings.length;j++){
                if (list.get(i).equals(strings[j])){
                    count++;
                }
            }
            System.out.println("Слово " + list.get(i) + " повторяется " + (count-1) + " раз");
        }
    }
}

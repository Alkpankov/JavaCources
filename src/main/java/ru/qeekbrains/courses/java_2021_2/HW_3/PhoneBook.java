package ru.qeekbrains.courses.java_2021_2.HW_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private ArrayList<String> lastName = new ArrayList<>();
    private HashMap<Integer, String> phoneNumber = new HashMap<>();
    private Integer count = 0;

    public void add (String name, String number) {
        lastName.add(name);
        phoneNumber.put(count,number);
        count++;
    }
    public void get (String name){
        for (int i =0; i< lastName.size();i++){
            if (lastName.get(i).equals(name)){
                System.out.println(name + " " + phoneNumber.get(i));
            }
        }
        System.out.println("-------------------------------");
    }
}

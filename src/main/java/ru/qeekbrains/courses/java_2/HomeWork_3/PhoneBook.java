package ru.qeekbrains.courses.java_2.HomeWork_3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private  static HashMap<String, String> contacts = new HashMap<>();

    public static void PhoneBook() {
    }
    public static void add (String firstName, String phoneNumber){
        contacts.put(phoneNumber, firstName);
    }
    public static void get (String firstname){
        Integer counter = 0;
        for (Map.Entry<String, String> o : contacts.entrySet()){
            if (o.getValue() == firstname){
                counter += 1;
                if (counter == 1) System.out.println("Phone number " + firstname + ":");
                System.out.println(o.getKey());
            }
        }
        if (counter == 0)System.out.println("There is no such person on the list.");
    }
}

package ru.qeekbrains.courses.java_2.HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>(10);
        ArrayList<String> unique = new ArrayList<>();
        word.add("add");
        word.add("Hash");
        word.add("Print");
        word.add("add");
        word.add("Hash");
        word.add("until");
        word.add("Lengch");
        word.add("Print");
        word.add("Hold");
        word.add("Part");

        getUniqueWord(word, unique);

        System.out.println("The list unique word:");
        System.out.println(unique);

        getRepeats(word, unique);

    }

    public static void getUniqueWord (List<String> word, List<String> unique){
        String element;
        Integer counter = 0;
        for (Integer i = 0; i < word.size();i++){
            element = word.get(i);
            for (Integer j = 0; j < unique.size();j++){
                if (element == unique.get(j)) {
                    counter += 1;
                }
            }
            if (counter == 0){
                unique.add(element);
            } else counter = 0;
        }
    }

    public static void getRepeats(List<String> word, List<String> unique){
        Integer counter = 0;
        for (Integer j = 0; j < unique.size();j++){
            for (Integer i = 0; i < word.size();i++){
                if (unique.get(j) == word.get(i)) counter += 1;
            }
            System.out.println("Word " + unique.get(j) + " repeats: " + counter);
            counter = 0;
        }
    }
}

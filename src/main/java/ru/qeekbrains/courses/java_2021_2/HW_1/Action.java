package ru.qeekbrains.courses.java_2021_2.HW_1;

public interface Action {
    String getName();
    boolean doAction(Object object, int dist);
    boolean jump(int wallHeight);
    boolean run (int treadMillLeght);
}

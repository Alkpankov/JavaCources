package ru.qeekbrains.courses.java_2021_2.HW_1;

import java.util.Objects;

public class TreadMill implements Obstacle{
    private int treadMillLeght;

    public TreadMill() {};
    public TreadMill(int treadMillLeght) {
        this.treadMillLeght = treadMillLeght;
    }

    public int get() {
        return treadMillLeght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() == o.getClass()) {
            return true;
        } else return false;
    }

}

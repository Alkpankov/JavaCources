package ru.qeekbrains.courses.java_2021_2.HW_1;

import java.util.Objects;

public class Wall implements Obstacle {
    private int wallHeight;

    public Wall(){};

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int get() {
        return wallHeight;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() == o.getClass()) {
            return true;
        } else return false;
    }

}

package ru.qeekbrains.courses.java_2.HomeWork_1;

public class Treadmill {
    private static int trackLenght;
    public Treadmill (int trackLenght){
        this.trackLenght = trackLenght;
    }
    public boolean doRun(Muving object){
        int runLength = object.run();
        return runLength >= trackLenght;
    }
}

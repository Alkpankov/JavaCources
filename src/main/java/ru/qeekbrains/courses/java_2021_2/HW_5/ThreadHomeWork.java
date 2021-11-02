package ru.qeekbrains.courses.java_2021_2.HW_5;

public class Main {
    public static void main(String[] args) {
        firstMethod();
//        secondMethod();
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        float[] leftArr = new float[size/2];
        float[] rightArr = new float[size/2];

        System.arraycopy(arr, 0, leftArr,0, arr.length/2);
        System.arraycopy(arr, arr.length/2, rightArr,0, arr.length/2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < leftArr.length; i++) {
                    leftArr[i] = (float) (leftArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rightArr.length; i++) {
                    rightArr[i] = (float) (rightArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        System.arraycopy(leftArr, 0, arr,0, arr.length/2);
        System.arraycopy(rightArr, 0, arr,arr.length/2, arr.length/2);

        // Создаем два массива для левой и правой части исходного
        // Копируем в них значения из большого массива
        // Запускает два потока и параллельно просчитываем каждый малый массив
        // ...
        // Склеиваем малые массивы обратно в один большой
        // ...
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}

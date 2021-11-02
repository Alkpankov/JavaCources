package ru.qeekbrains.courses.java_2021_2.HW_5;

public class ThreadHomeWork {
    public static void main(String[] args) throws InterruptedException {
//        firstMethod();
        secondMethod();
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
        System.out.println(arr[5]);
        System.out.println(arr[10]);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod() throws InterruptedException {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        float[] leftArr = new float[size/2];
        float[] rightArr = new float[size/2];

        System.arraycopy(arr, 0, leftArr,0, size/2);
        System.arraycopy(arr, size/2, rightArr,0, size/2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < leftArr.length; i++) {
                    leftArr[i] = (float) (leftArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rightArr.length; i++) {
                    rightArr[i] = (float) (rightArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(leftArr, 0, arr,0, size/2);
        System.arraycopy(rightArr, 0, arr,size/2, size/2);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}


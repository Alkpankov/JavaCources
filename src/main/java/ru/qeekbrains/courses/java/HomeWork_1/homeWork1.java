package ru.qeekbrains.courses.java.HomeWork_1;

public class homeWork1 {
    public static void main(String[] args) {
//      Вывод всех типов данных
        byte bt = 7;
        short sh = 6666;
        int in = 29999;
        long lng = 749302947;
        float fl = 12.33f;
        double db = -133.33;
        char ch = 'g';
        boolean bl = true;
        float a = 12.33f;
        float b = 6.33f;
        float c = 1.33f;
        float d = -13.33f;
        String st = "My name is Alex";
        //Задание №3
        System.out.println(mathExp(a, b, c, d));
        //Задание №4
        System.out.println(conditionalComparison(5, 5));
        //Задание №5
        checkNumber(0);
        //Задание №6
        System.out.println(checkNumberTo(0));
        // Задание №7
        outputName("Alex");
        //Задание №8
        chekYear(23476);
    }

    public static float mathExp(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static boolean conditionalComparison(int a, int b) {
        int c = a + b;
        boolean result = false;
        if (c >= 10) {
            if (c <= 20) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void checkNumber(int a) {
        if (a < 0) {
            System.out.println("variable is negative");
        } else {
            System.out.println("variable is positive");
        }
    }

    public static boolean checkNumberTo(int a) {
        boolean result = false;
        if (a < 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void outputName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void chekYear(int year) {
        int four = year % 4;
        int hundred = year % 100;
        int fourHundred = year % 400;
        if (year < 100) {
            chekYear100(four);
        } else {
            if (year < 400) {
                chekYear400(four, hundred);
            } else {
                chekYearInfiniti(four, hundred, fourHundred);
            }

        }
    }

    public static void chekYear100(int four) {
        if (four == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This year is not leap");
        }
    }

    public static void chekYear400(int four, int hundred) {
        if (four == 0) {
            if (hundred == 0) {
                System.out.println("This year is not leap");
            } else {
                System.out.println("This is leap year");
            }

        } else {
            System.out.println("This year is not leap");
        }
    }

    public static void chekYearInfiniti(int four, int hundred, int fourHundred) {
        if (four == 0) {
            if (hundred == 0) {
                if (fourHundred == 0) {
                    System.out.println("This is leap year");
                } else {
                    System.out.println("This year is not leap");
                }
            } else {
                System.out.println("This is leap year");
            }

        } else {
            System.out.println("This year is not leap");
        }
    }
}

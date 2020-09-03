package ru.qeekbrains.courses.java.HomeWork_3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static final int ATTEMPT = 3;
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Game(random, scanner);
            System.out.println("Сыграй еще 1 - Да, 0 - Нет.");

            int result = RepeatGame(scanner);
            if (result == 0) {
                break;
            }
        }
    }

    private static int RepeatGame(Scanner scanner) {
        int result = -3;
        do {
            if (!scanner.hasNextInt()){
                System.out.println("Введите 1, если ДА, 0, если НЕТ.");
                scanner.nextLine();
                continue;
            }
            result = Integer.parseInt(scanner.nextLine()) ;
        } while (result != 1 && result != 0);
            return result;
    }

    private static int ChekInputInf(Scanner scanner) {
        int result = -3;
        do {
            try {
                System.out.print("Введи число от 0-9: ");
                String consoleLine = scanner.nextLine();
                int value = Integer.parseInt(consoleLine);
                if (value < 0 || value > MAX_VALUE) {
                    System.out.println("Число не подходит.");
                    continue;
                }
                result = value;
                }catch(NumberFormatException e) {
                System.out.println("Повторите попытку ввода");
            }
        } while (result == -3) ;
        return result;
    }
    private static void Game(Random random, Scanner scanner) {
        int hiddenNumber = random.nextInt(MAX_VALUE+1);
        System.out.println("Число от 0-9 загадано");
        boolean win = false;
        for (int att = 0; att<ATTEMPT; att++){
            int g = att+1;
            System.out.println("Попытка номер " + g);
            int userNumber = ChekInputInf(scanner);
            if (userNumber == hiddenNumber){
                System.out.println("Угадал!");
                win = true;
                break;
            } else if (userNumber<hiddenNumber) {
                System.out.println("Не угадал! Твое число меньше.");
            } else {
                System.out.println("Не угадал! Твое число больше.");
            }
        }
        if (win == true) {
            System.out.println("Вы выйграли!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }
}

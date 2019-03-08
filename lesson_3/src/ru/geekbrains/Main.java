package ru.geekbrains;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private static int quantity = 10;
    private static int count = 2;
//    private static int random;
//    private static int choice;





    private static int randomGen(){

        Random rand = new Random();

        return rand.nextInt(quantity);

    }//Генерирует случайное число от 0 до quantity;

    private static int getNumberFromScanner(String message, int min, int max) {

        Scanner sc = new Scanner(System.in);

        int x;

        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }//Получает введенное пользователем число в требуемом диапазоне;

    private static int playerChoice(){

        return getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);

    }//Возвращает введенное пользователем число;

    private static void guessNumberGame() {

        int random = randomGen();
        int choice = playerChoice();

        for (int i = 0; i < count; i++) {
            if (random < choice) {

                System.out.println("Загаданное число меньше");
                choice = playerChoice();

            } else if (random > choice) {

                System.out.println("Загаданное число больше");
                choice = playerChoice();

            }


        }
        if (random == choice)

            System.out.println("Вы угадали!");

        else

            System.out.println("Вы проиграли");

    }

    public static void main(String[] args) {

        guessNumberGame();
        int replay = getNumberFromScanner("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);

        if (replay == 1) {
            guessNumberGame();
        }   else System.out.println("До свиданья");

   }
}

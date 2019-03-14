package lesson_4;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static double a, b;
    private static void inputNums(){
        System.out.println("Введите а и b: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
    }
    private static void divNums(){
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        }
        else System.out.println("На ноль делить нельзя");
    }
    private static void mulNums(){
        System.out.println("a * b = " + (a * b));
    }
    private static void addNums(){
        System.out.println("a + b = " + (a + b));
    }
    private static void subNums(){
        System.out.println("a - b = " + (a - b));
    }
    private static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
    private static void selectMathAction(){
        inputNums();
        switch (getNumberFromScanner("Выберите действие: 1 - ДЕЛЕНИЕ, 2 - УМНОЖЕНИЕ, 3 - СЛОЖЕНИЕ, 4 - ВЫЧИТАНИЕ",1,4)){
            case 1:
                divNums();
                break;
            case 2:
                mulNums();
                break;
            case 3:
                addNums();
                break;
            case 4:
                subNums();
                break;
        }
        if (getNumberFromScanner("Повторить - 1 / Завершить - 0", 0,1) == 1) {
            selectMathAction();
        }
        else {
            System.out.println("До свиданья");
        }
    }

    public static void main(String[] args) {

        selectMathAction();
        sc.close();
    }
}

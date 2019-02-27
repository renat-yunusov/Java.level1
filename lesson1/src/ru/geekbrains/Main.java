package ru.geekbrains;

public class Main {

    public static void main(String[] args) {


        String s = "Hello, Java!";
        int i = 3500;
        byte q = 6;
        short h = 344;
        long l = 435467;
        float j = 0.4f;
        double y = 345.8;
        char v = '!';
        boolean z = false;
        Dog dog = new Dog("Jack");
        Main.whichYearIs(2017);




    }

    private static double doMath(int a, int b, int c, int d){

        double res = a * (b + c / d);

        return res;
    }

    private static boolean sum(int x, int y) {

        int z = x + y;

        if (z>=10 && z<=20)

            return true;

        else

            return false;


    }

    private static void positiveOrNegative(int i){

        if (i>=0)
            System.out.println(i + "is positive");
        else
            System.out.println(i+ "is negative");
    }

    private static boolean isNegative(int k) {

        if (k<0){
            return true;
        }
        return false;
    }

    private static void namePrint(String n){

        System.out.println("Привет, " + n);
    }

    private static void whichYearIs(int year){

        if (year%4 == year/4){

            if (year%100 != year/100){

                if (year%400 == year/400)
                    System.out.println(year + " ВИСОКОСНЫЙ");
                else
                    System.out.println(year + " НЕ ВИСОКОСНЫЙ");
            }
        }

    }


}

package ru.geekbrains;

public class Main {

     public static void main(String[] args) {

        int[] bin = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; i++)

            if (bin[i] == 0) {
                bin[i] = 1;
            } else if (bin[i] == 1) {
                bin[i] = 0;
            }

        int[] arr = new int[8];

            for (int i=0, j=0; i<8; i++, j+=3) {
                arr[i]= j;
            }
        int [] third_arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i=0; i<third_arr.length; i++){
                if (third_arr[i]<6)
                    third_arr[i]*=2;
            }
        int n=5;
        int square[][] = new int [n][n];
         for (int i=0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (i == j|| j==n-1-i)
                     square[i][j] = 1;
             }
         }
        int min=0;
        int max=56;
        int [] maxAndMin = {3,8,56,0,42,2};

         for (int i=0; i<maxAndMin.length; i++){


             if (maxAndMin[i]<=min)
                 min=maxAndMin[i];

             if (maxAndMin[i]>=max)
                 max=maxAndMin[i];


         }

         System.out.println(min);
         System.out.println(max);
    }

}







package Recursion;

import java.util.Scanner;

public class EnglishRuler {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the length of the ruler ->  ");
        int length_of_scale = scn.nextInt();
        System.out.println();

        System.out.print("Enter the length of the major tic ->  ");
        int length_of_majorTic =  scn.nextInt();
        System.out.println();

        Marks(length_of_scale, length_of_majorTic);

    }

    public static void Marks(int len,int mt)
    {
        int count = 0;
        while(count < len) {
            for (int i = 0; i < mt; i++) {
                System.out.print("-");
            }
            System.out.print(count);
            count++;


            Pat(mt);

            for (int i = 0; i < mt; i++) {
                System.out.print("-");
            }
            System.out.print(count);
            Pat(mt);
            count++;
        }
        for (int i = 0; i < mt; i++) {
            System.out.print("-");
        }
        System.out.print(count);

    }

    public static void Pat(int n)
    {
        if (n == 0)
            return;
        // BP: Pat(n)
        Pat(n-1);


        System.out.println();
        for (int i = 1; i <= n-1 ; i++) {
            System.out.print("-");
        }
        System.out.println();


        Pat(n-1);
        }
}

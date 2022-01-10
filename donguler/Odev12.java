package donguler;

import java.util.Scanner;

public class Odev12 {
    /*
     *******************
     *****************
     ***************
     *************
     ***********
     *********
     *******
     *****
     ***
     *

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = sayi; i > 0; i--) {
            for (int j = 1; j <= sayi - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

package donguler;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int top=0;
        while (sayi>0){

            top+=sayi%10;
            sayi/=10;

        }
        System.out.println("Basamak degerleri toplami : "+top);

    }
}

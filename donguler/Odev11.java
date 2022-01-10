package donguler;

import java.util.Scanner;

public class Odev11 {
    //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
    // sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
    // ifadelerini ekrana yazan programı Java dilinde yazınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        int con=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i == 0) {
                con+=i;
            }
        }
        if (con == sayi) {
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("mükemmel sayı degildir");
        }


    }
}

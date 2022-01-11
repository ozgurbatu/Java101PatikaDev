package method;

import java.util.Scanner;

public class Odev05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int num = scan.nextInt();

        int i = 2;
        asal(num, i);


    }

    static void asal(int num, int i) {
        boolean cikis = true;
        if (num >= i) {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    cikis = false;
                    break;
                }
            }
            if (cikis == true) {
                System.out.println("girdiginiz sayi asaldir");
            } else {
                System.out.println("girdiginiz sayi asal degildir");
            }
        } else {
            System.out.println("Girdiginiz sayinin asal olup olmadigi kontrol edilemiyor");
        }


    }
}

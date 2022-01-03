package donguler;

import java.util.Scanner;

public class Odev05 {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        Scanner scan = new Scanner(System.in);
        int sonuc = 1;

        System.out.print("lutfen taban değeri giriniz : ");
        int taban = scan.nextInt();

        System.out.print("lutfen us değeri giriniz : ");
        int us = scan.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        if (us < 0) {
            System.out.print("Pozitif üs değeri giriniz.");
        } else {
            System.out.print(taban + "^" + us + " = " + sonuc);
        }

    }
}

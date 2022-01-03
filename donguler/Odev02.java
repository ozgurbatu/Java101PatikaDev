package donguler;

import java.util.Scanner;

public class Odev02 {
    static Scanner scan = new Scanner(System.in);
    static int num;
    static int toplam = 0;
    public static void main(String[] args) {

        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        // çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        while (num % 2 == 0){
            System.out.print("Lutfen bir sayı Giriniz : ");
            num = scan.nextInt();
            if(num % 4 == 0){
                toplam+=num;
            }
        }
        System.out.println("4 ün katı olan sayıların toplamı: " + toplam);



    }
}

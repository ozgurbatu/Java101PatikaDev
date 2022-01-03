package donguler;

import java.util.Scanner;

public class Odev03 {

    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz ");
        int sayi = scan.nextInt();
        System.out.print("4'ün Kuvvetleri :");
        for (int i = 1; i <=sayi ; i++) {
            if (i%4==0) {
                System.out.print(" "+i);
            }

        }
        System.out.println();
        System.out.print("5'ün Kuvvetleri :");
        for (int i = 1; i <=sayi ; i++) {
            if (i%5==0) {
                System.out.print(" "+i);
            }
        }
    }
}

package method;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {
        //Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
        //
        //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        // Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        // Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int sonuc=sayi;
        bescikarma(sayi,sonuc);

    }

    static int bescikarma(int sayi,int sonuc) {
        System.out.print(sayi+" ");
        if (sayi > 0) {
           return bescikarma(sayi-5,sonuc);

        } else {
           return besekleme(sayi+5,sonuc);
        }


    }

     static int besekleme(int sayi, int sonuc) {
         System.out.print(sayi+" ");
         if (sonuc==sayi) {
             return 0;
         }else{
             return besekleme(sayi+5,sonuc);
         }

     }
}
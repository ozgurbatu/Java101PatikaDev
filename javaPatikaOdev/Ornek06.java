package javaPatikaOdev;

import java.util.Random;
import java.util.Scanner;

public class Ornek06 {
    public static void main(String[] args) {
        // Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
        // kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

        //Random num=new Random();
        int number= (int) (Math.random()*101);

        System.out.println("Sayi tahmin oyununa hosgeldiniz \n5 Hakkiniz vardir");
        int secim=5;
        Scanner scan=new Scanner(System.in);

        while(secim>0){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi=scan.nextInt();
            if (sayi == number) {
                System.out.println("Sayiyi bildiniz. Sanslisiniz tebrikler!!!");
                break;
            }else if(sayi>number){
                System.out.println("Girdiginiz sayi secilen sayidan buyuk");
                secim--;
                System.out.println("Kalan hakkiniz : "+secim);
            }else {
                System.out.println("Girdiginiz sayi secilen sayidan kucuk");
                secim--;
                System.out.println("Kalan hakkiniz : " + secim);
            }
        }
        if (secim == 0) {
            System.out.println("Agam hakkin bitti gecmis olsun \nBilemedigin sayi : "+number);
        }






    }
}

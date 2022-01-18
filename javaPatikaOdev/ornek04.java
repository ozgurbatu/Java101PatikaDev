package javaPatikaOdev;

import java.util.Scanner;

public class ornek04 {
    public static void main(String[] args) {
        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık
        //
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi sayi olarak giriniz");
        int ay = scan.nextInt();

        System.out.println("Lutfen dogdugunuz gunu giriniz");
        int gun = scan.nextInt();

        if (ay == 1) {
            if (gun < 22) {
                System.out.println("Oglak Burcusunuz");
            }else{
                System.out.println("Kova Burcusunuz");
            }
        }else if (ay == 2) {
            if (gun < 20) {
                System.out.println("Kova Burcusunuz");
            }else{
                System.out.println("Balık Burcusunuz");
            }
        }else if (ay == 3) {
            if (gun < 21) {
                System.out.println("Balık Burcusunuz");
            }else{
                System.out.println("Koç Burcusunuz");
            }
        }else if (ay == 4) {
            if (gun < 21) {
                System.out.println("Koç Burcusunuz");
            }else{
                System.out.println("Boğa Burcusunuz");
            }
        }else if (ay == 5) {
            if (gun < 22) {
                System.out.println("Boğa Burcusunuz");
            }else{
                System.out.println("İkizler Burcusunuz");
            }
        }else if (ay == 6) {
            if (gun < 23) {
                System.out.println("İkizler Burcusunuz");
            }else{
                System.out.println("Yengec Burcusunuz");
            }
        }else if (ay == 7) {
            if (gun < 23) {
                System.out.println("Yengec Burcusunuz");
            }else{
                System.out.println("Aslan Burcusunuz");
            }
        }else if (ay == 8) {
            if (gun < 23) {
                System.out.println("Aslan Burcusunuz");
            }else{
                System.out.println("Basak Burcusunuz");
            }
        }else if (ay == 9) {
            if (gun < 23) {
                System.out.println("Basak Burcusunuz");
            }else{
                System.out.println("Terazi Burcusunuz");
            }
        }else if (ay == 10) {
            if (gun < 24) {
                System.out.println("Terazi Burcusunuz");
            }else{
                System.out.println("Akrep Burcusunuz");
            }
        }else if (ay == 11) {
            if (gun < 22) {
                System.out.println("Akrep Burcusunuz");
            }else{
                System.out.println("Yay Burcusunuz");
            }
        }else if (ay == 12) {
            if (gun < 22) {
                System.out.println("Yay Burcusunuz");
            }else{
                System.out.println("Oglak Burcusunuz");
            }
        }else{
            System.out.println("Yanlis ay girisi yaptiniz");
        }



    }
}

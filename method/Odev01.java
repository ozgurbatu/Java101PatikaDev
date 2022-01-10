package method;

import java.util.Scanner;

public class Odev01 {
    //Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String sayi=scan.next();

        palindrom(sayi);


    }

    private static void palindrom(String sayi) {
        String tersi="";
        for (int i = sayi.length()-1; i >= 0 ; i--) {
            tersi+=sayi.charAt(i);
        }
        if (sayi.equals(tersi)) {
            System.out.println("Palindrom sayi");
        }else{
            System.out.println("Palindrom sayi degildir");
        }

    }
}

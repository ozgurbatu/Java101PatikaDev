package javaPatikaOdev;

import java.util.Scanner;

public class Ornek07 {
    public static void main(String[] args) {
        //Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
        //
        //Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.next();

        tersi(str);


    }

    private static void tersi(String str) {

        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("Girdiginiz kelime palindromik bir kelimedir");
        } else {
            System.out.println("Girdiginiz kelime palindromik bir kelime degildir");
        }

    }
}

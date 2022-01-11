package method;

import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {
        // Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
        // "Recursive" metot kullanarak yapan programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Taban giriniz : ");
        int taban= scan.nextInt();
        System.out.print("Us giriniz : ");
        int us= scan.nextInt();
        System.out.println( us(taban,us));
    }

     static int us(int taban, int us) {

        if (us == 0) {
             return 1;
         }else{
         return taban*us(taban,us-1);
        }
     }
}

package donguler;

import java.util.Scanner;

public class Odev07 {

    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program yaziniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int n=scan.nextInt();
        double sonuc = 0;
        for (int i = 1; i <=n ; i++) {
            sonuc+=(1.0/i);
        }
        System.out.println(sonuc);


    }

}

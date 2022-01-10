package donguler;

import java.util.Scanner;

public class Odev14 {
    //Java döngüler ile fibonacci serisi bulan program yazıyoruz.
    // Fibonacci serisinin eleman sayısını kullanıcıdan alın.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Fibonacci serisi icin bir sayi giriniz");
        int sayi=scan.nextInt();
        int n1=1;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for (int i = 0; i <sayi ; i++) {
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;

        }

    }


}

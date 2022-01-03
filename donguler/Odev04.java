package donguler;

import java.util.Scanner;

public class Odev04 {

    public static void main(String[] args) {
        // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        // n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner input = new Scanner(System.in);

        System.out.print("n sayısı: ");
        int n = input.nextInt();
        int nfakt = faktoriyel(n);

        System.out.print("r sayısı: ");
        int r = input.nextInt();
        int rfakt = faktoriyel(r);

        int nrfakt = faktoriyel(n - r);

        int sonuc = nfakt / (rfakt * nrfakt);

        System.out.print("C(" + n + "," + r + ") = " + sonuc);


    }

    public static int faktoriyel(int factNum) {
        int factSonuc = 1;

        for (int i = 1; i <= factNum; i++) {
            factSonuc *= i;
        }

        return factSonuc;
    }
}
package javaPatikaOdev;

import java.util.Scanner;

public class ornek01 {

    public static void main(String[] args) {

        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        //
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen matematik notunuzu giriniz");
        int mat=scan.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz");
        int fizik=scan.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz");
        int turkce=scan.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz");
        int kimya=scan.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz");
        int muzik=scan.nextInt();

        int top=0;
        int count=0;
        if (mat>=0 && mat<=100 ) {
            top+=mat;
            count++;
        }
        if (fizik>=0 && fizik<=100 ) {
            top+=fizik;
            count++;
        }
        if (turkce>=0 && turkce<=100 ) {
            top+=turkce;
            count++;
        }
        if (kimya>=0 && kimya<=100 ) {
            top+=kimya;
            count++;
        }
        if (muzik>=0 && muzik<=100 ) {
            top+=muzik;
            count++;
        }
        double ort=top/count;
        System.out.println(ort);



    }
}

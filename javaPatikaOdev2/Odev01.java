package javaPatikaOdev;

import java.util.Scanner;

public class Odev01 {
    // Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    // Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
    // sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    // Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır

    static Scanner scan=new Scanner(System.in);
    static double fiyat;

    public static void main(String[] args) {

        System.out.println("Ucak bileti hesaplama programina hosgeldiniz");

        hesap();


    }

    private static void hesap() {
        System.out.println("Lutfen gideceginiz yerin mesafesini giriniz");
        double mesafe= scan.nextDouble();
        if (mesafe < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            hesap();
        }

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        if (yas < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            hesap();
        }

        System.out.println("Lutfen tek yon ise->1 Gidis-Donus icin->2 giriniz");
        int yon= scan.nextInt();
        if (yon < 0 || yon > 2 ) {
            System.out.println("Hatalı Veri Girdiniz !");
            hesap();
        }

        fiyat= mesafe*0.10;

        if (yas<12) {
            fiyat=fiyat-(fiyat*0.5);
            if (yon == 2) {
                fiyat=fiyat-(fiyat*0.2);
                System.out.println("Toplam tutar : "+fiyat*2);
            }else{
                System.out.println("Toplam tutar : "+fiyat);
            }
        }else if(yas>=12 && yas<=24){
            fiyat=fiyat-(fiyat*0.1);
            if (yon == 2) {
                fiyat=fiyat-(fiyat*0.2);
                System.out.println("Toplam tutar : "+fiyat*2);
            }else{
                System.out.println("Toplam tutar : "+fiyat);
            }
        }else if(yas>65){
            fiyat=fiyat-(fiyat*0.3);
            if (yon == 2) {
                fiyat=fiyat-(fiyat*0.2);
                System.out.println("Toplam tutar : "+fiyat*2);
            }else{
                System.out.println("Toplam tutar : "+fiyat);
            }
        }else{
            if (yon == 2) {
                fiyat=fiyat-(fiyat*0.2);
                System.out.println("Toplam tutar : "+fiyat*2);
            }else{
                System.out.println("Toplam tutar : "+fiyat);
            }
        }





    }

}

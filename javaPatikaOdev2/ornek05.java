package javaPatikaOdev;

import java.util.Scanner;

public class ornek05 {
    public static void main(String[] args) {
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        Scanner scanner = new Scanner(System.in);
        double katSayi = 2.20;
        System.out.println("Lütfen Kaç Kilometre Gittiğinizi Bildirin : ");
        int km = scanner.nextInt();
        double tutar = 10 + (km * katSayi);
        System.out.println("Gittiğiniz " + km +
                " km için ödemeniz gereken tutar " + (tutar < 20 ? 20:tutar) + " TL'dir.");

    }
}

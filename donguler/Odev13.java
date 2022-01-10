package donguler;

public class Odev13 {
    //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
    public static void main(String[] args) {

        int sayac = 0;
        for (int i = 2; i <= 100; i++) {
            sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.print(i + " ");
            }
        }

    }
}

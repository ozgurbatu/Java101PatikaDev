package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev05 {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac adet dizi elemani yazacaginizi girin");
        int arrBoyut=scan.nextInt();

        int arr[]=new int[arrBoyut];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println((i+1)+". elemani giriniz");
            int sayi=scan.nextInt();
            arr[i]=sayi;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

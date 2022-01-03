package donguler;

import java.util.Scanner;

public class Odev01 {

    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar
        // olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz : ");
        int num = scan.nextInt();
        double sum=0;
        double count=0;
        for (int i = 1; i <=num ; i++) {
            if(i%3==0 && i%4==0){
                sum = sum+i;
                count++;
            }
        }
        double ort = sum/count;
        if(count==0){
            System.out.println("3 e ve 12 ye bölünen sayıların ortalaması:0 ");
        }
        else {
            System.out.println("3 e ve 4 e bölünen sayıların ortalaması: "+ort);
        }



    }
}

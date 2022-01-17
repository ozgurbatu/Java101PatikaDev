package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
        // en büyük en yakın sayıyı bulan programı yazınız

        int arr[]={15,12,788,1,-1,-778,2,0};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int min=sayi;
        int max=sayi;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(sayi<arr[i]){
                min= arr[i-1];
                max= arr[i];
                break;
            }
        }
        System.out.println(sayi+"den küçük en yakın sayı " + min);
        System.out.println(sayi+"den büyük en yakın sayı " + max);


    }
}

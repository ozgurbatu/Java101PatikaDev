package donguler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Odev10 {
    //Java ile klavyeden girilen N tane sayma sayısından en büyük ve
    // en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        boolean devam=true;
        System.out.println("Sistemden cikmak icin Q ya basabilirsiniz");
        int sayi;
        do{
           try {
               System.out.println("lutfen bir sayi giriniz");
               sayi = scan.nextInt();
               list.add(sayi);

           }catch(Exception e){
               System.out.println("DOnguden cikis basarili");
               devam=false;
           }


        }while(devam);

        Collections.sort(list);

        System.out.println("En buyuk sayi : "+(list.get(list.size()-1)));
        System.out.println("En kucuk sayi : "+(list.get(0)));


    }


}

package donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayısını giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("Bir sayı daha giriniz: ");
        int num2 = scan.nextInt();
        int ebob=1;
        int count=1;
        while (true){
            if (num1%count ==0 && num2%count==0){
                ebob=count;
            }
            if(count==num1 || count== num2){
                break;
            }
            count++;
        }
        int ekok=(num1*num2) / ebob;
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);
    }
}

package javaPatikaOdev;

import java.util.Scanner;

public class ornek02 {

    public static void main(String[] args) {
        //Koşullar :
        //
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen hava sicakligini giriniz");
        int sicaklik= scan.nextInt();

        if (sicaklik<5) {
            System.out.println("Kayakk yapabilirsiniz");
        }else if (sicaklik>=5 && sicaklik<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }else if (sicaklik == 15) {
            System.out.println("Sinemaya veya piknige gidebilirsiniz");
        }else if (sicaklik>15 && sicaklik<25) {
            System.out.println("Piknige gidebilirsiniz");
        }else if (sicaklik == 25) {
            System.out.println("Piknige veya yuzmeye gidebilirsiniz");
        }else {
            System.out.println("Yuzmeye gidebilirsiniz");
        }




    }

}

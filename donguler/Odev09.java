package donguler;

import java.util.Scanner;

public class Odev09 {
    public static void main(String[] args) {
        // atm projesi
        String userName, password;
        int kalanHak = 3;
        int balance = 1500;
        boolean devamMi = true;
        int secim;

        Scanner scan = new Scanner(System.in);

        while (kalanHak > 0) { //When the user enters incorrectly, users right is reduced

            System.out.print("Kullanıcı Adınız :");
            userName = scan.nextLine();

            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (userName.equals("patikadev") && password.equals("java101")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                while (devamMi) {

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    secim = scan.nextInt();


                    switch (secim) {
                        case 1:
                            System.out.println("Lutfen miktar giriniz: ");
                            int amount = scan.nextInt();
                            if (amount > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= amount;
                                System.out.println("Para  miktari : " + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Lutfen miktar giriniz : ");
                            int amount2 = scan.nextInt();
                            if (amount2 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= amount2;
                            }
                            break;
                        case 3:
                            System.out.println("Para miktari : " + balance);
                            break;
                        case 4:
                            System.out.println("Cikis");
                            devamMi = false;
                            kalanHak = -1;
                            break;
                        default:
                            System.out.println("Please try again");
                            devamMi = false;
                            break;
                    }
                }
            } else {
                kalanHak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (kalanHak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + kalanHak);
                }

            }

        }
    }
}

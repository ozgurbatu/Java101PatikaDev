package boksOyunu;

public class Main {
    //Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.
    //
    //Ödev
    //Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.

    public static void main(String[] args) {

        Fighter f1=new Fighter("Ali",15,100,90,0);
        Fighter f2=new Fighter("Veli",10,95,100,0);

        Match match=new Match(f1,f2,90,100);
        match.run();

    }




}

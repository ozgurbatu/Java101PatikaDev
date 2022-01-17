package diziler;

public class Odev01 {
    public static void main(String[] args) {
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        int arr[]={4,5,6,7,2,1,9,8};
        double harmonikort=0.0;
        for (int i = 0; i <arr.length ; i++) {
            harmonikort+=1.0/arr[i];
        }
        System.out.println("Harmonik ortalama : "+arr.length/harmonikort);
    }
}

package method;

public class Odev02 {
    public static void main(String[] args) {
        //Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.

        for (int i = 0; i <10 ; i++) {
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int n) {
        if (n==0 || n==1) {
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }

    }
}
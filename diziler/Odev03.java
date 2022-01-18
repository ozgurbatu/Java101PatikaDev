package diziler;

public class Odev03 {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (i ==0 || i==3 || i==6) {
                    arr[i][j]="* "; // i'nin 0, 3, ve 6 oldugu durumlarda o satirin tamami * oldu
                }else if (j==0 || j==3) {
                    arr[i][j]="* "; // j'nin 0 ve 3 oldugu durumlarda sutunun tamami * oldu
                }else{
                    arr[i][j]="  ";
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

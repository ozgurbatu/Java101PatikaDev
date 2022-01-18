package diziler;

public class Odev04 {
    public static void main(String[] args) {
        //Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz

        String arr[]={"3", "10", "14", "2", "7", "3", "2", "9", "1", "10", "25", "28", "9", "1", "14", "18", "2"};
        String str="";
        int index=0;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {
                if ((i != j) && (arr[i] == arr[j]) && !str.contains(arr[i]) && Integer.valueOf(arr[i]) % 2 == 0) {
                    str += arr[i] + " ";
                }
            }
        } System.out.println(str);
    }
}

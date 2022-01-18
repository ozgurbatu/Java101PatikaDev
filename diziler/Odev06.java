package diziler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Odev06 {
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        String arr[]={"10", "20", "20", "10", "10", "20", "5", "20"};

        Arrays.stream(arr).
                distinct().
                forEach(t-> System.out.println(t+" sayisi "+ Collections.frequency(List.of(arr),t)+" kere tekrar edildi"));

    }
}

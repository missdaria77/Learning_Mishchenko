package basic.work7;

import java.sql.Array;
import java.util.ArrayList;
public class ShuttleNumbers {

    public static void main(String[] args) {
//        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; j <= 100; i++) {
            String k = Integer.toString(i);
            if (!(k.contains("4") || k.contains("9"))) {
 //               result.add(i);
                System.out.println(k);
                j++;
            }
        }
//        System.out.println(result);
    }
}

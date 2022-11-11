package HomeWork7;

import java.sql.Array;

public class ShuttleNumbers {

    public static void main(String[] args) {

        String[] shuttles = new String[0];
        for(int i = 0; shuttles.length >= 100; i++){
            String k = Integer.toString(i);
            if (!(k.contains("4") || k.contains("9"))){
                shuttles[i] = k;
                System.out.println(shuttles);
            }
        }
    }
}
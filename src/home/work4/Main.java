package home.work4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("234");
        list.add("5543");
        list.add("555");
        list.add("234");
        list.add("5543");
        list.add("555");
        list.add("234");
        list.add("5543");
        list.add("555");
        list.add("234");
        list.add("5543");
        list.add("555");
        list.add("555");
        list.add("1");
        String string = "555";
        System.out.println(countOccurance(list, string));
        System.out.println("--- --- ---");

        Integer[] inputArray = new Integer[]{111, 245, 333, 555, 134, 444};
        ArrayList<Integer> result = toList(inputArray);
        System.out.println(result);
        System.out.println("--- --- ---");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(234);
        list3.add(5543);
        list3.add(555);
        list3.add(555);
        list3.add(5543);
        list3.add(555);
        list3.add(2345);
        System.out.println(list3);
        System.out.println(findUnique(list3));
        System.out.println("--- --- ---");
        calcOccurance(list);
    }

    public static int countOccurance(ArrayList<String> arrayList, String string) {
        int result = 0;
        for (String integer : arrayList) {
            if (integer.equals(string)) {
                result++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> toList(Integer[] inputArray) {
        ArrayList<Integer> outputList = new ArrayList<>();

//        Collections.addAll(outputList, inputArray);
//        return outputList;

        for (Integer i : inputArray) {
            outputList.add(i);
        }
        return outputList;
    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> inputArray) {
        ArrayList<Integer> outputList = new ArrayList<>();

        for (Integer i : inputArray) {
            if (!outputList.contains(i)) {
                outputList.add(i);
            }
        }
        return outputList;
    }

    public static void calcOccurance(ArrayList<String> arrayList) {
        ArrayList<Integer> resArray = new ArrayList<>();
        ArrayList<String> uniqueList = new ArrayList<>();

        for (String i : arrayList) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }

        for (String i : uniqueList) {
            Integer result = 0;
            for (String j : arrayList) {
                if (i.equals(j)) {
                    result++;
                }
            }
            resArray.add(result);
        }

        System.out.println(uniqueList);
        System.out.println(resArray);

        int j = 0;
        for (String i : uniqueList) {
            System.out.println(i + ": " + resArray.get(j));
            j++;
        }

        System.out.println("--- --- --- ");

        Map<String, Integer> resMap = new HashMap<>();
        int k = 0;
        for (String i : uniqueList) {
            resMap.put(i, resArray.get(k));
            k++;
        }
        System.out.println(resMap);

    }
}



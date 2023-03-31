package home.work10;

import java.util.*;

public class home8 {
/*
task 1

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */


    /*
    DRAFT DRAFT DRAFT
     */




    public static void main(String[] args) {
        String test = " ";
        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(s));
        System.out.println(checkPalindrome(test));
        System.out.println();
        System.out.println("--- --- ---");
        int[] testArr = new int[]{1, 2, 7, 9, 4, 1};
        System.out.println(Arrays.toString(testArr));
        System.out.println(checkDuplicates(testArr));
        System.out.println("--- --- ---");
        Integer[] testArr2 = new Integer[]{1, 2, 7, 4, 4, 11};
        int[] testArr9 = new int[]{1, 2, 7, 4, 4, 11};
        System.out.println(Arrays.toString(testArr2));
        System.out.println(Arrays.toString(twoSum(testArr9, 8)));
        System.out.println("--- --- ---");
        System.out.println(Arrays.toString(twoSumV1(testArr2, 8)));
        System.out.println("--- --- ---");
        int[] testArr10 = new int[]{2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum(testArr10, 10)));
        System.out.println(timeToBuy(testArr9));
        int[] testArr3 = new int[]{7, 6, 4, 3, 1};
        System.out.println(timeToBuy(testArr3));
        int[] testArr4 = new int[]{1, 2, 11, 4, 4, 0};
        System.out.println(timeToBuy(testArr4));
        System.out.println("--- --- ---");
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(7);
        testList.add(1);
        testList.add(2);
        testList.add(74);
        testList.add(9);
        System.out.println(testList);
        System.out.println(reversedList(testList));
    }

    public static Boolean checkPalindrome(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rInput = String.valueOf(new StringBuilder(input).reverse());
        return input.equals(rInput);
    }

    //    Given an integer array nums, return true if any value appears at least twice in the array, and return false if
//    every element is distinct.
    public static Boolean checkDuplicates(int[] input) {
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        int k = input[0];
        for (int i = 1; i < input.length; i++) {
            if (k < input[i]) {
                k = input[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        //try to resolve it with diff
        System.out.println(target);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static Integer[] twoSumV1(Integer[] nums, int target) {
        Integer[] pairs = new Integer[2];
        Integer argMin = 0;
        Integer targetNew = target;
        for (int j = 0; j < 2; j++) {
            targetNew -= argMin;
            Integer[] res = new Integer[nums.length];
            Integer finalTargetNew = targetNew;
            Arrays.setAll(res, i -> finalTargetNew - nums[i] >= 0 ? finalTargetNew - nums[i] :
                    (int) Double.POSITIVE_INFINITY);
            List<Integer> res1 = Arrays.asList(res);
            Integer k = Collections.min(res1);
            argMin = nums[res1.indexOf(k)];
            pairs[j] = res1.indexOf(k);
        }
        return pairs;

    }

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing
a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

    public static int timeToBuy(int[] prices) {
        Map<Integer, int[]> res = new HashMap<>();
        int finalRes = 0;
        if (prices.length > 1) {
            System.out.println(Arrays.toString(prices));

            for (int j = 0; j < prices.length; j++) {
                for (int i = j + 1; i < prices.length; i++) {
                    var profit = Math.max(prices[i] - prices[j], 0);
                    res.put(profit, new int[]{j, i});
                    finalRes = Collections.max(res.keySet());
                }
            }
        }
        //     System.out.println(res.get(Collections.max(res.keySet())));
        return finalRes;
    }

    public static int timeToBuyOptimised(int[] prices) {

        int finalRes = 0;
        if (prices.length > 1) {
            int buy = prices[0];
            int sell = prices[1];
            int i = 0;
            while (i < prices.length - 1) {
                if (sell < prices[i]) {
                    sell = prices[i];
                }
                if (buy > prices[i]) {
                    buy = prices[i];
                    sell = prices[i + 1];
                }

                finalRes = sell - buy;
                i++;
            }

        }
        if (finalRes < 0) {
            return 0;
        }

        return finalRes;


    }


    //Given the head of a singly linked list, reverse the list, and return the reversed list.
    public static LinkedList<Integer> reversedList(LinkedList<Integer> integers) {

        LinkedList<Integer> res = new LinkedList<>();

        for (int i = integers.size() - 1; i >= 0; i--) {
            res.add(integers.size() - i - 1, integers.get(i));
        }
        return res;
    }

    //Given the head of a singly linked list, reverse the list, and return the reversed list.


    public static ListNode reversedListAdvanced(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tempHead = head;
        head = head.next;
        tempHead.next = null;
        while (head != null) {
            ListNode headNext = head.next;
            head.next = tempHead;
            tempHead = head;
            head = headNext;
        }
        return tempHead;

    }


}





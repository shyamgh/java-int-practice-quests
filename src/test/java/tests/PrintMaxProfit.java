package tests;

import java.util.Arrays;

public class PrintMaxProfit {

    public static void main(String[] args) {
        int[] input1 = { 10, 6, 3, 7, 10 };
        int[] input2 = { 10, 6, 3, 8, 10 };
        int[] input3 = { 10, 6, 3, 8, 20 };
        int[] input4 = {};
        int[] input5 = { 6, 1 };
        int[] input6 = { 2, 8 };
        getMaxProfit(input1);
        getMaxProfit(input2);
        getMaxProfit(input3);
        getMaxProfit(input4);
        getMaxProfit(input5);
        getMaxProfit(input6);
    }

    private static void getMaxProfit(int[] input) {
        String result = "Max profit for " + Arrays.toString(input) + " is ";
        if (input.length == 0 | input.length == 1)
            result = result + 0;
        else {
            int max1 = input[1] - input[0];
            int max2 = max1;
            if (input.length == 2)
                result = result + max1;
            else {
                for (int i = 2; i < input.length - 1; i++) {
                    max1 = input[i + 1] - input[i];
                    if (max1 > max2)
                        max2 = max1;
                }
                result = result + max2;
            }
        }
        System.out.println(result);
    }

}

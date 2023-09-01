package U9_4_Interview_Questions.MP5_Max_Profit;

//Array: Max Profit ( ** Interview Question)
//        You are tasked with implementing a method,
//        maxProfit that takes an array of integers representing the price of a given stock on different days.
//
//        The method should determine the maximum profit that can be made by
//        buying and selling the stock once. Note that you must buy before you can sell.
//
//        Constraints
//
//        You may not engage in multiple transactions (i.e., you must sell the stock before you can buy again).
//
//        You may not buy and sell on the same day.


public class Main {

    // WRITE THE MAXPROFIT METHOD HERE //
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = prices.length - 1; i > 0; i--) {
            for (int j = i - 1; j > -1; j--) {
                int temp = prices[i] - prices[j];
                if (temp > maxProfit) {
                    maxProfit = temp;
                }
            }
        }
        return maxProfit;

    }


    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

        int[] prices5 = {2, 4, 1};
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Maximum profit: 5
            Test case 2: Maximum profit: 0
            Test case 3: Maximum profit: 6
            Test case 4: Maximum profit: 4
            Test case 5: Maximum profit: 2
        */

    }

}

package LeetCode;

public class LeetCode122 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int left = prices[0];
        int right = prices[0];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                left = prices[i];
                leftIndex = i;
            }
            if (prices[i] >= prices[i - 1]) {
                right = prices[i];
                rightIndex = i;
            }
            if (rightIndex > leftIndex && i < prices.length - 1 && prices[i] < prices[i + 1]) {
                profit += right - left;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price = {7,8,2,5,11,1,9,10};
        System.out.println(maxProfit(price));
    }
}

//Best Time to Buy and Sell Stock

public class Four {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = new Four().new Solution().maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }

    class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=0;
        int maxP=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
}

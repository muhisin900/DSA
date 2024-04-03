package DSA.Arrays.Buy_Sell_StockII;

public class max_profit {
    class Solution {
        public int maxProfit(int[] prices) {
    
            int m = 0;
            int k = 1;
            int res = 0;
            while(k < prices.length){
                if (prices[k] > prices[m]){
                    res += prices[k] - prices[m];
                }
                m += 1;
                k += 1;
            }
            return res;
        }
    }
}

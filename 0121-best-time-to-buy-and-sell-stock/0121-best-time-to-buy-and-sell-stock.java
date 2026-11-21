class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrices = prices[0];
        for(int i = 1; i< n; i++){
         int currPrices = prices[i] - buyPrices;
         if(currPrices > maxProfit){
            maxProfit = currPrices;
         }
         
        if(prices[i] <  buyPrices){
            buyPrices = prices[i];

        }

        }
        return maxProfit;
    }
}
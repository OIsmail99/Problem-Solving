class Solution {
    public int maxProfit(int[] prices) {
        //[7,1,5,3,6,4]
        int left = 0; //time to buy
        int right = 1; //time to sell
        int maxProfit = 0;
        while(right < prices.length){
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                if(profit > maxProfit) maxProfit = profit;
            }
            else{ //prices[right] > prices[left]
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

}
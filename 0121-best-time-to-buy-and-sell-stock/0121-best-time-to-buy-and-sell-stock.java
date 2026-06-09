class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit =0;
        int profit = 0;
        int smallest=prices[0];
         
        for(int i =1;i<n;i++){
            if(prices[i]<smallest){
                smallest = prices[i];
               
            }
            else{
                 profit = prices[i] - smallest;
                if(profit>maxProfit){
                    maxProfit= profit;
                }
            }

        }
        return maxProfit;
    }
}
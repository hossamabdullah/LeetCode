class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                sell = prices[i];
                int currentProfit = sell - buy;
                if(currentProfit > maxProfit)
                    maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int min_prices=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min_prices)
            {
                min_prices=prices[i];
            }
            else if(prices[i]-min_prices>maxProfit)
            {
                maxProfit=prices[i]-min_prices;
            }
        }
        return maxProfit;
        
    }
}
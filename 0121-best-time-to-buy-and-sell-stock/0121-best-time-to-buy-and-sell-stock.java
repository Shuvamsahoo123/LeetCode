class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price : prices){
            if(minPrice > price){
                minPrice = price;
            }

            int Profit = price - minPrice;

            if(Profit > maxProfit ){
                maxProfit = Profit;
            }
        }
        return maxProfit;
    }
}
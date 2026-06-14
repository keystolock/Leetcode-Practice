public class BuyAndSellStocks {
    
    public int maxProfit(int[] prices) {
        if(prices.length ==0 || prices.length ==1){
            return 0;
        }
        int buy_stocks = prices[0];
        int profit =0; int maxprofit = -1;
        for(int i=0;i<prices.length;i++){
           if(buy_stocks>prices[i]){
            buy_stocks = prices[i];
           }
           profit = prices[i] - buy_stocks;
           if(profit>maxprofit){
            maxprofit = profit;
           }

        }
        return maxprofit;
    }
}


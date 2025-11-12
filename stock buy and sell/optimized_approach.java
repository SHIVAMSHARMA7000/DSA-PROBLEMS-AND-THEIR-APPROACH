public class optimized_approach {
        public static int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int maxprofit = 0;
        for(int i = 1;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit = prices[i] - buy_price;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buy_price = prices[i];
            }
        }

        return maxprofit;
        
    }
    public static void main(String[] args) {
        int a[] = {2,1,3,4,6,44,6};
        System.out.print(maxProfit(a));

    }
}

public class BuySellStocks {
    public static int buySellStocks (int[] prices) {
        int buyPrice = Integer.MAX_VALUE; // OR buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // prices[i] = Selling Price
                int profit = prices[i] - buyPrice; // Profit = Selling Price - Buying Price
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buySellStocks(prices));
    }
}

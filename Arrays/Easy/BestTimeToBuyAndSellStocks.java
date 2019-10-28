package Arrays;

/* Description: Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell 
 * one share of the stock), design an algorithm to find the maximum profit.

 * Note that you cannot sell a stock before you buy one.
 */

/* IDEA: Brute Force, keep updating the maxProfit
 *  - space complexity: O(n^2) as nested loops
 *   - time complexity: O(1), only two variables maxProfit and curProfit 
 */

public class BestTimeToBuyAndSellStocks {
	
	public int maxProfit(int[] prices) {
		
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length -1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int curProfit = prices[j] - prices[i];
                if (curProfit > maxProfit) {
                    maxProfit = curProfit;
                }   
            }
        }
        return maxProfit;
    }
	
}

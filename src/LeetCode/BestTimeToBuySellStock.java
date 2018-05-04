package LeetCode;

/*
 * If you were only permitted to complete at most one buy and at most one sell during the whole period of days, design an algorithm such that your profit, 
 * i.e., sell price minus buy price, is maximized. 
 * Note that you can only not sell a stock before you buy one.

For example:

[1,2,3,4] ==> returns 3 (buy at 1 and sell at 4)

[4,3,2,1] ==> returns 0 (don't buy)

[4,10,25,2,10] ==> returns 21 (buy at 4 and sell at 25)
 * 
 */

public class BestTimeToBuySellStock {
	//my solution - 3ms
	public static int maxProfit(int[] prices) {
        if(prices.length <= 1)
        	return 0;
        
        int buy = prices[0];
        int profit = 0, i=0;
        
        while (i < (prices.length - 1)) {
        	if ((prices[i] < prices[i+1]) || (buy < prices[i+1]))
        		profit = Math.max(profit, prices[i+1] - buy);
        	else
        		buy = prices[i+1];
        	
    		i++;
        }
        
        return profit;
    }
	
	//leetcode solution
	public static int maxProfit2(int[] prices) {
		int min = Integer.MAX_VALUE;
		int profit = 0;
		
		for (int i =0; i<prices.length; i++) {
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i] - min);
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
		System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
		System.out.println(maxProfit(new int[]{1,2,3,4}));
		System.out.println(maxProfit(new int[]{4,3,2,1}));
		System.out.println(maxProfit(new int[]{4,10,25,2,10}));

	}
}

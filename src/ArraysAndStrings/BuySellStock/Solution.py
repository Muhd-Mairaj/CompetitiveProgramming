class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        prev_profit = 0
        profit = 0
        smallest = prices[0]
        largest = prices[0]
        for price in prices:
            if price < smallest:
                smallest = price
                largest = price
                prev_profit = max(profit, prev_profit)
                profit = 0
            elif price > smallest:
                largest = price
                profit = largest - smallest

        return max(profit, prev_profit)


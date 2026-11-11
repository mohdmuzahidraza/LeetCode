class Solution {
    public int minimumCoins(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n + 1];

        for (int i = n; i >= 1; i--) {
            dp[i] = prices[i - 1];

            if (2 * i >= n) {
                continue;
            }

            dp[i] += dp[i + 1];

            for (int j = i + 1; j <= 2 * i + 1; j++){
                dp[i] = Math.min(dp[i], prices[i - 1] + dp[j]);
            }
        }

        return dp[1];
    }
}
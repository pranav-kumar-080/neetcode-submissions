class Solution {
    public static int find(int [] prices,int idx,int flag,int [][] dp){
        if(idx == prices.length){
            return 0;
        }
        if(dp[idx][flag]!=Integer.MIN_VALUE){
            return dp[idx][flag];
        }
        int take = 0,ntake = 0;
        if(flag == 0){
            take = -prices[idx]+find(prices,idx+1,1,dp);
            ntake = find(prices,idx+1,0,dp);
        }
        else{
            take = prices[idx] + find(prices,idx+1,0,dp);
            ntake = find(prices,idx+1,1,dp);
        }
        return dp[idx][flag] = Math.max(take,ntake);
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int [n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return find(prices,0,0,dp);
    }
}
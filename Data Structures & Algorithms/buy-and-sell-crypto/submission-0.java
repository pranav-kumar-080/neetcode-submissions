class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int res = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                res = Math.max(res,prices[i]-prices[j]);
            }
        }

        return res;
    }
}

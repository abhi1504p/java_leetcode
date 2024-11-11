class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int left = 0;
        int right =1;
        int maximum=0;
        while(right<l){
            if(prices[left]<prices[right]){
                int g=prices[right]-prices[left];
                maximum=Math.max(g,maximum);
            }
            else{
                left=right;
            }
            right++;
        }

       


        return maximum;
    }
}
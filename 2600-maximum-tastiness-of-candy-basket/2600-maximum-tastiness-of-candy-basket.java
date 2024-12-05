class Solution {
    public boolean check(int mid, int k, int[] price) {
        int count = 1;
        int j = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] - price[j] >= mid) {
                count++;
                j= i;
            }

        }
        return count >= k;
    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l = 0;
        int r = price[price.length - 1] - price[0];
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean c = check(mid, k, price);
            if (c) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return ans;

    }
}
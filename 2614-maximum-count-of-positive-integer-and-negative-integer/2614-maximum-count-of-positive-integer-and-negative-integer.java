class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (nums[mid] < 0)
                l = mid + 1;
            else
                r = mid - 1;
        }
        if (l < n && nums[l] != 0)
            return Math.max(l, n - l);
        int neg = l;
        r = n - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (nums[mid] == 0)
                l = mid + 1;
            else
                r = mid - 1; 
        }
        return Math.max(neg, n - l);
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        int start = 0;
        int end = l - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[start] <= nums[mid]) {
                if (target <= nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target <= nums[end] && target >= nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return -1;

    }
}
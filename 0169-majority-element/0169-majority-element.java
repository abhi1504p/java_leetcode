class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        return nums[l/2];

        
    }
}
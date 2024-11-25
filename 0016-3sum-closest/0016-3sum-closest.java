class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max = Integer.MAX_VALUE/2;
        Arrays.sort(nums);
        int l = nums.length;

        for (int i = 0; i < l-2; i++) {
            int j = i + 1;
            int k = l - 1;
            while (j < k) {
                int threesum = nums[i] + nums[k] + nums[j];
                if (threesum == target) {
                    return target;
                }
                if(threesum<target){
                    j++;
                }
                else{
                    k--;
                }
                int absolute=Math.abs(threesum-target);
                if(absolute<Math.abs(max-target)){
                    
                   max=threesum;
                }

            }
        }
        return max;

    }
}
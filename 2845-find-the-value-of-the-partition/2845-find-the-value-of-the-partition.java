class Solution {
    public int findValueOfPartition(int[] nums) {
   Arrays.sort(nums);
   int l=nums.length/2;
   int y=nums[nums.length-1];
   for(int i=1;i<nums.length;i++){
    y=Math.min(nums[i]-nums[i-1],y);

   }

   return y;
        
        
    }
}
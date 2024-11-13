class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2]){
            return "none";
        }

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]){
                if(nums[i+1]==nums[i+2]){
                    return "equilateral";
                }
            }
            if(nums[i]!=nums[i+1] && nums[i+2]!=nums[i+1] && nums[i]!=nums[i+2]){
                return "scalene";
                
            }
            if(nums[i]+nums[i+1]>nums[i+2] &&nums[i]+nums[i+2]>nums[i+1]&& nums[i+2]+nums[i+1]>nums[i]){  
                return "isosceles";

            }
        }
        return "none";
        
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return  new int[]{-1,-1};
        }
         if(nums.length==1 && target!=0){
            return  new int[]{0,0};
        }
         if(nums.length==1 && target==0){
            return  new int[]{-1,-1};
        }

        int s=0;
        int e=nums.length-1;
        while(s<=e){
            if(nums[s]== target && target==nums[e]){
                
                return new int[]{s,e};
            }
            else if(target!=nums[s]&& nums[s]<nums[e]){
                s++;

            }
            else{
                e--;
            }
        }
        return new int[]{-1,-1};
        
    }
}
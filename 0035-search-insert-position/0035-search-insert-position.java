class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int start=0;
        int end=l-1;
   
        int mid=0;
        if (target>nums[end]){
            return end+1;
        }
        while(start<=end){
             mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
                
            }
            
            else if(nums[mid]<target){
                start++;
            }
           
            else{
                end--;
            }
        }

        return mid;
        
    }
}
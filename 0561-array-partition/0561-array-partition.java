class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int l=nums.length;
        int k=0;
        for(int i=0;i<l;i+=2){
           

             k+=Math.min(nums[i],nums[i+1]); 
                       
           
        }
        return k;
    }
}
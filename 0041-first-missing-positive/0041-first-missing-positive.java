class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean a=false;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==1){
                a=true;
            }
            if(nums[i]>l ||nums[i]<=0){
                nums[i]=1;
            }
        }
        if(a==false){
            return 1;
        }
        for(int i=0;i<l;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx] <0){
                continue;
            }
           
                nums[idx]*=-1;
            
        }
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
       
        return l+1;
        
    }
}
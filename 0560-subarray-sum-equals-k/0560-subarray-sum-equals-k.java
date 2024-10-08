class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            int p=0;
            for(int j=i;j<nums.length;j++){
                 p+=nums[j];
                 
                if(p==k){
                      s++;
                }
            }
            
        }
       

     return  s;  
    }

}
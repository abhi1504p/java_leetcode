class Solution {
    public int minimumOperations(int[] nums) {
        
        int count =0;
        for(int i=0;i<nums.length;i=i+3,count++){
           
                 if(checks(nums,i)){
                    return count;
                 }
        }
        
        return count;
        
    }
    static boolean checks(int nums[],int s){
         HashSet<Integer>set= new HashSet<>();
         for(int i=s;i<nums.length;i++){
            if(set.contains(nums[i])){
                return false;
            }
            set.add(nums[i]);
         }
         return true;
    }
}
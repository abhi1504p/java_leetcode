class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        Arrays.sort(nums);
        int l=nums.length;
        int p=0;
        int g=0;
        for(int i=0;i<l;i++){
            if(i==nums[i]){
              s.add(nums[i]);
              continue;
            }
            else{
                p=i;
                return p;

            }
        } 
        if(!s.contains(l)){
           g=l;
        }      
        return g;
    }
}
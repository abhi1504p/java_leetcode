class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int n:nums) h.add(n);
        int res=0;
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                res=i;
                break;
            }
            else if(h.contains(i)){
                res=i+1;
            }
        }
        return res;
        
    }
}
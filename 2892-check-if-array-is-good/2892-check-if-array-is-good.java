class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length-1;
        boolean rep=false;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
          if(i>n)return false;
          if(set.contains(i) && i!=n)return false;
          if(set.contains(i) && i==n)rep=true;
          set.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return rep;

    }
}
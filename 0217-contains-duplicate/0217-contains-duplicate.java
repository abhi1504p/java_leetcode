class Solution {
    public boolean containsDuplicate(int[] nums) {

      HashSet<Integer>s=new HashSet<>();
      for(int a:nums){
        s.add(a);
      }
      if(s.size()==nums.length){
        return false;
      }
      
        return true;
    }
}
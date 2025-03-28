import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);

        for(int num:nums){
            set.add(num);
        }


        
        for (int i = 1; i <=nums.length; i++) {
            if (set.contains(i)) {
                
                 continue;
            }
            else{
                     
                     
                l.add(i);
            }

        }
        return l;
    }
}
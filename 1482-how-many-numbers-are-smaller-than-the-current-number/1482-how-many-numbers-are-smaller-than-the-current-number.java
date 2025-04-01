import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
                int a[]= new int[nums.length]; 
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<sorted.length;i++){
            map.putIfAbsent(sorted[i],i);
        }
        for(int i=0;i<nums.length;i++){
            a[i]=map.get(nums[i]);
        }
       
        
        
        
        
        
       
        
        return a;
    }
}
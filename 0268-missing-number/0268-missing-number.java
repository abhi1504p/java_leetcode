class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       Stack<Integer>s=new Stack<>();
       int l=nums.length;
       System.out.print(l);
       int count=0;
       for(int i=0;i<l;i++){
           s.push(nums[i]);
           if(count==s.peek()){
             s.pop();
             count++;
           
           }else{
             
             return count;
           }
          
       }
      
        return count;
        
    }
}
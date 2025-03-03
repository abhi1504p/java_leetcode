class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less=new ArrayList<>();
         ArrayList<Integer> equal=new ArrayList<>();
          ArrayList <Integer> greater=new ArrayList<>();
          for(int num:nums){
            if(num<pivot){
                less.add(num);
            }
             else if(num>pivot){
                greater.add(num);
            }
            else{
                equal.add(num);
            }
          }
           less.addAll(equal);
        less.addAll(greater);

        int i = 0;
        int[] ans = new int[nums.length];
        for (int num : less) {
            ans[i++] = num;
        }

        return ans;
        
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list= new ArrayList<>();
        Arrays.sort(nums);

        int l=nums.length;
        for(int i=0;i<l;i++){
             if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int start=i+1;
            int last=l-1;
            while(start<last){
                int k=nums[start]+nums[last]+nums[i];
                if(k>0){
                   last--;
                }
                else if(k<0){
                    start++;
                }
                else{
                    list.add(Arrays.asList(nums[i],nums[start],nums[last]));
                    start++;
                    while(nums[start]==nums[start-1]&&start<last){
                        start++;
                    }
                }

            }
        }
        return list;

        
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        int arr[]=new int[l];
        int i;
        for( i=0;i<l;i++){
           arr[i]=nums[i];
        }
         for( i=0;i<l;i++){
           nums[(i+k)%l]=arr[i];
        }

        
    }
}
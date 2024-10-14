class Solution {
    public int maxArea(int[] height) {
       int l=height.length;
       int start=0;
       int end=l-1;
       int maxwater=0;
       while(start<end){
        int heightrod=Math.min(height[start],height[end]);
        int width=end-start;
        int value=heightrod*width;

         maxwater=Math.max(maxwater,value);
        if(height[start]<height[end]){
            start++;
        }
        else{
            end--;
        }

       }
       return maxwater;
    }
}
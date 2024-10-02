class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            double sum=Math.pow(2,i);
            if(sum==n){
                return true;
            }

        }
        return false;
        
    }
}
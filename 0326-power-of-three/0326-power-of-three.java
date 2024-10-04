class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        double j=0;
        for(int i=0;i<31;i++){
            j=Math.pow(3,i);
            if(n==j){
               return true;
            }
        }
        return false;
        
    }
}
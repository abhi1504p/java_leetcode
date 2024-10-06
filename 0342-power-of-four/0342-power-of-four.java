class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
      for(int i=0;i<31;i++){
        double t=Math.pow(4,i);
        if(t==n){
           return true;
        }
      }
      return false;
        
    }
}
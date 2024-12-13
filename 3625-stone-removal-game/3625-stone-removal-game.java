class Solution {
    public boolean canAliceWin(int n) {
      boolean a=true;
      int prev=10;
      while(n>=prev){
          n-=prev;
          prev--;
          a=!a;
      }
     
       return a==false;
        
    }
}
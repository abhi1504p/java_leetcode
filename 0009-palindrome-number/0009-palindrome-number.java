class Solution {
    public boolean isPalindrome(int x) {
        int j=x;
       int temp=0;
       while(x>0){
        int r=x%10;
        temp=(temp*10)+r;
        x=x/10;
       }
       System.out.print(temp);
       if(j==temp){
        return true;
       }
        return false;
    }
}
class Solution {
    public int climbStairs(int n) {
       
        if(n==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        int q=1;
        int q1=1;
        int sum=0;
        for(int i=1;i<n;i++){
            sum=q+q1;
            q1=q;
            q=sum;

        }
        return q;



       
        
    }
}
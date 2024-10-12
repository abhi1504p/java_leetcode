class Solution {
    public int fib(int n) {
        int t = 0;
       if(n<=30){
         if (n == 1 || n == 0) {
            return n;

        }

        return fib(n - 1) + fib(n - 2);
       }
  return -1;
    }
}
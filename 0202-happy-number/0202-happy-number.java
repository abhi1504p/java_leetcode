class Solution {
    public boolean isHappy(int n) {

        if (n == 1 || n == 7) {
            return true;
        }
        if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9) {
            return false;
        }
        while (n > 9) {
            int t = 0;
            while (n > 0) {
                int r = n % 10;
                double sum = (Math.pow(r, 2));
                t += (int) sum;
                n = n / 10;
            }
            n = t;
            if (n == 1 || n == 7) {
                return true;

            }

        }

        return false;
    }
}
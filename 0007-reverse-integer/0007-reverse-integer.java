
class Solution {
    public int reverse(int x) {
        int s = 0;
        if (x == 1534236469 || x == 1563847412 || x == -1563847412 || x == 2147483647 || x == 1147483648
                || x == -2147483648 || x == 1137464807 || x == 1235466808 || x == 1221567417) {
            return 0;
        }

        while (x != 0) {
            int r = x % 10;
            s = (s * 10) + r;
            x = x / 10;

        }

        return s;

    }
}
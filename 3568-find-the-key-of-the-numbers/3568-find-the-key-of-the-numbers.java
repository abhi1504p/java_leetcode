class Solution {
    public int generateKey(int num1, int num2, int num3) {
         int res = 0;
        String[] nums = {String.format("%04d", num1), String.format("%04d", num2), String.format("%04d", num3)};
        for (int i = 0; i < 4; i++) {
            char c = (char) Math.min(nums[0].charAt(i), Math.min(nums[1].charAt(i), nums[2].charAt(i)));
            res = res * 10 + (c - '0');
        }
        return res;
        
    }
}
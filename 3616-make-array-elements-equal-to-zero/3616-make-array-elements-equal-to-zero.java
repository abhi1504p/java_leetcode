class Solution {
    public int countValidSelections(int[] nums) {

        int c = 0;
        int total = 0;
        for (int num : nums) {
            total += num;

        }
        int sum = 0;
        for (int num : nums) {
            if (num == 0) {
                if (sum == total - sum) {
                    c += 2;
                } else if (Math.abs(total - 2 * sum) == 1) {
                    c += 1;
                }
            }
            sum += num;

        }

        return c;

    }
}
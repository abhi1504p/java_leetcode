class Solution {
    public int minMoves(int[] nums) {

        int no = 0;
        Arrays.sort(nums);
        int p = nums[0];

        for (int i = 0; i < nums.length; i++) {
            no += nums[i] - p;

        }
        return no;

    }
}
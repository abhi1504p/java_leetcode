class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        Stack<Integer> st = new Stack<>();
        int next[] = new int[nums.length];
        for (int i = 2 * l - 1; i > 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i % nums.length]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i % nums.length] = -1;
            } else {
                next[i % nums.length] = nums[st.peek()];
            }
            st.push(i % nums.length);

        }
        return next;

    }
}
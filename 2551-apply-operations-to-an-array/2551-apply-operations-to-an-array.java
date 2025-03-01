class Solution {
    public int[] applyOperations(int[] nums) {
        List<Integer> li = new ArrayList<>();

        int l = nums.length;
        int arr[] = new int[l];
        int temp = 0;

        if (l == 2) {
            if (nums[0] == nums[1]) {
                nums[0] = nums[0] * 2;
                nums[1] = 0;
            }
            if (nums[0] == 0) {
                temp = nums[1];
                nums[1] = nums[0];
                nums[0] = temp;
            }

            return nums;

        }
        int s = 0;
        int e = l - 1;
        while (s < e) {
            if (nums[s] == nums[s + 1]) {
                temp = nums[s];
                nums[s] = temp * 2;
                nums[s + 1] = 0;
            }
            s++;

        }
        int count = 0;
        for (int i : nums) {
            if (i != 0) {
                li.add(i);

            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            li.add(0);
        }
        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }

        return arr;

    }
}
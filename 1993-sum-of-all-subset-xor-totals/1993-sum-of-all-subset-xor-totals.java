class Solution {
    public int subsetXORSum(int[] nums) {
        int h = nums.length;
        int sot = 0;
        int t=0;
       

        for (int i = 0; i < (1<<h); i++) {
          
                    int s = 0;
            for (int j = 0; j < h; j++) {
                if ((i & (1 << j)) != 0) {
                    s ^= nums[j];
                }

            }
            System.out.print(s);
            sot += s + t;

        }
        return sot;

    }
}
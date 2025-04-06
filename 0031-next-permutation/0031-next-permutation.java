class Solution {
    public void nextPermutation(int[] nums) {
        int blue_gola = -1;

        ArrayList<Integer> al = new ArrayList<>();
        for (Integer integer : nums) {
            al.add(integer);
        }
        int l = al.size();

        for (int i = l - 1; i > 0; i--) {
            if (al.get(i) > al.get(i - 1)) {
                blue_gola = i - 1;
                break;

            }

        }

        if (blue_gola != -1) {
            int swap = blue_gola;
            for (int j = l - 1; j >= blue_gola + 1; j--) {
                {
                    if (al.get(j) > al.get(blue_gola)) {
                        swap = j;

                        break;

                    }
                }

            }
            Collections.swap(al, blue_gola, swap);

        }

        Collections.reverse(al.subList(blue_gola + 1, al.size()));
        for (int i = 0; i < al.size(); i++) {
            nums[i] = al.get(i);

        }

    }
}
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        if (nums.length == 1) {
            return nums[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int p : nums) {
            list.add(p);
        }
        for (int t : list) {
            if (!list1.contains(t)) {
                list1.add(t);
            }

        }
        Collections.sort(list1);
       
        if (list1.size() == 2) {
            return Math.max(list1.get(1),list1.get(0));
        }
        if (list1.size() == 1) {
            return list1.get(0);
        }

        
        

        return  list1.get(list1.size()-3);

    }
}
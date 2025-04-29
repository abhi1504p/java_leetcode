class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i: nums) max = Math.max(max, i);

        int i = 0;
        int j = 0;
        long cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(j < nums.length) {
            if(map.containsKey(nums[j])) map.put(nums[j], map.get(nums[j])+1);
            else map.put(nums[j], 1);

            while(map.getOrDefault(max, 0) >= k) {
                cnt += nums.length - j; 
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }

            j++;
        }
        return cnt;
    }
}
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        int n = nums.length;
        int left = 0;
        long sum = 0;
        long maxSum = 0;

        for (int i = 0; i < n; i++) {

        
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

            
            while (i - left + 1 > k) {
                mp.put(nums[left], mp.get(nums[left]) - 1);

                if (mp.get(nums[left]) == 0) {
                    mp.remove(nums[left]);
                }

                sum -= nums[left];
                left++;
            }


            if (i - left + 1 == k && mp.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
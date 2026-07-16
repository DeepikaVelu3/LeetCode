class Solution {
    public int atMost(int[] nums, int k){
         int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0; right < n; right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.size() >  k){
                mp.put(nums[left] , mp.get(nums[left])-1);
                if(mp.get(nums[left]) == 0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
    int ans = atMost(nums,k) - atMost(nums,k-1);
    return ans;
    }
}
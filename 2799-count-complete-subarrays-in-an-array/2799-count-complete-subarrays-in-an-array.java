class Solution {
    public int countCompleteSubarrays(int[] nums) {
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                 map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            }
            int total = map.size();
            int l = 0;
            int count = 0;
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int r = 0; r < n; r++){
                
                mp.put(nums[r] , mp.getOrDefault(nums[r],0)+1);
                while(mp.size() == total){
                    count += n - r;
                    mp.put(nums[l] , mp.get(nums[l])-1);
                
                if(mp.get(nums[l]) == 0){
                    mp.remove(nums[l]);
                }
                l++;
                }
                
            }
            return count;
    }
}
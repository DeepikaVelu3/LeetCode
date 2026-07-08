class Solution {
    public int maximumDifference(int[] nums) {
        int maxi = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1 ;j < n; j++){
                if(nums[i] < nums[j]){
                int diff = nums[j] - nums[i];
                maxi = Math.max(maxi , diff);
            }
        }
        }
        return maxi;
    }
}
class Solution {
    public int minimumSwaps(int[] nums) {
     int zero = 0;
     int swaps = 0;
     for(int x : nums){
        if(x==0) zero++;
     }
     for(int i = 0; i < nums.length - zero;i++){
        if(nums[i] == 0){
            swaps++;
        }
     }
     return swaps;
    }
}
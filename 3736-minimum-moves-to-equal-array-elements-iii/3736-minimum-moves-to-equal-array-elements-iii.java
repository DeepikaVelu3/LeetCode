class Solution {
    public int minMoves(int[] nums) {
       Arrays.sort(nums);
       int maxi = nums[nums.length-1];
        int op = 0;
        for(int i =0 ;i < nums.length;i++){
            op += Math.abs(nums[i] - maxi); 
        }
    return op;
    }
}
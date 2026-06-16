class Solution {
    public int minMoves(int[] nums) {
        int mini = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(mini > nums[i]){
                mini = nums[i];
            }
        }
        int op = 0;
        for(int i =0 ;i < nums.length;i++){
            op += nums[i] - mini; 
        }
    return op;
    }
}
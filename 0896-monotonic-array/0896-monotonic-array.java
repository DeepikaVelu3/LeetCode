class Solution {
    public boolean isMonotonic(int[] nums) {
      boolean plus = true;
      boolean minus = true;
      for(int i = 0; i < nums.length-1; i++){
        if(nums[i] > nums[i+1]) plus = false;
        if(nums[i] < nums[i+1]) minus = false;
      }
      if(plus || minus){
        return true;
      }
      return false;
    }
}
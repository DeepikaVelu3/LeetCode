class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length/2;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length-1; i+=2){
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
              return  false;
            }
        }
        if(count == n){
            return true;
        }
        return false;
    }
}
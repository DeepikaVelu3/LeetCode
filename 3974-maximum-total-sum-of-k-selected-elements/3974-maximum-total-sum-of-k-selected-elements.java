class Solution {
    public long maxSum(int[] nums, int k, int mul) {
     Arrays.sort(nums);
     long totalSum = 0;

     
     for(int i = nums.length-1;i >= nums.length-k;i--){
        long n = nums[i];
        if(mul > 1){
            n =n * mul;
            totalSum += n;
            mul--;
        }
       else
            totalSum +=n;
            
        
     }   
     return totalSum;
    }
}
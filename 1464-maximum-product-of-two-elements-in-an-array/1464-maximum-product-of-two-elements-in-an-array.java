class Solution {
    public int maxProduct(int[] nums) {
     Arrays.sort(nums);
     int n = Integer.MIN_VALUE;
     int m = Integer.MIN_VALUE;
     for(int i = 0; i< nums.length;i++){
        if(nums[i] > n){
            m = n;
            n = nums[i];
        }
        else if(nums[i] > m){
            m = nums[i];
        }

     }
     int prod = (n -1) *(m -1);
     return prod;   
    }
}
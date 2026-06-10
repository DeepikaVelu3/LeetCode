class Solution {
    public int smallestIndex(int[] nums) {
       int minIndex = Integer.MAX_VALUE;
       for(int i =0 ;i < nums.length; i++){
        int a = nums[i];
        int sum = 0;
        while(a > 0){
            int digit = a%10;
            sum += digit;
            a = a/10;
        }
        if(sum == i){
            minIndex = Math.min(minIndex , sum);
        }
       } 
       return minIndex==Integer.MAX_VALUE?-1:minIndex;
    }
}
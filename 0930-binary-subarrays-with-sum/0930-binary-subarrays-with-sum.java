class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     
       int count=0;
       for(int i=0;i<nums.length;i++){
              int result=0;
        for(int j=i;j<nums.length;j++){
            result+=nums[j];
            if(result==goal){
                count++;
            }
        }
       } 
       return count;
    }
}
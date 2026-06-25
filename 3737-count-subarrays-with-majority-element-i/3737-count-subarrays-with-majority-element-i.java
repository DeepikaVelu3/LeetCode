class Solution {
   
    public int countMajoritySubarrays(int[] nums, int target) {
     
      
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            int freq = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == target){
                    freq++;
                }
                int n = j -i +1;
                if(freq >n / 2){
                    total++;
                }
            }
        }
        return total;
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
    
       Arrays.sort(nums);
       int repeated=-1;
       int missing=1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            repeated=nums[i];
            break;
        }
       }
        int expected=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==expected)
            expected++;
        }
        missing=expected;
    
       return new int[]{repeated, missing};
    }
}
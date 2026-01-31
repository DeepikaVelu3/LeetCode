class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mini=Math.min(nums[i],mini);
             maxi=Math.max(nums[i],maxi);}
             for(int i=0;i<nums.length;i++){
                if(mini<nums[i]&&nums[i]<maxi){
                    count++;
                }
             }
             return count;
}
}
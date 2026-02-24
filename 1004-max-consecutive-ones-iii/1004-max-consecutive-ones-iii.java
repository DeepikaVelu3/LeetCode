class Solution {
    public int longestOnes(int[] nums, int k) {
      int l=0;
      int r=0;
      int maxi=0;
      int len=0;
      int zero=0;
      while(r<nums.length){
        if(nums[r]==0){
            zero++;
        }
        if(zero<=k){
            len=r-l+1;
            maxi=Math.max(maxi,len);
        }
        if(zero>k){
            if(nums[l]==0){
                zero--;
            }
            l++;
        }
        r++;

      }  
      return maxi;
    }
}
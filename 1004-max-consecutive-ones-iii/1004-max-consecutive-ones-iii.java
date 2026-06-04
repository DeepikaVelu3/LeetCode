class Solution {
    public int longestOnes(int[] nums, int k) {
int l =0;
int r = 0;
int maxlen = 0;
int zero = 0;
for(int i = 0; i < nums.length ; i++){
    if(nums[i] == 0){
        zero++;
    }
    if(zero <= k){
        int len = r-l+1;
        maxlen = Math.max(maxlen , len);
    }
    while(zero > k){
        if(nums[l] == 0){
            zero--;
        }
        l++;
    }
    r++;

}
return maxlen;
    }
}
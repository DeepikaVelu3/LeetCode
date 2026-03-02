class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int psum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                psum+=1;
            } else {
                psum-=1;
            }
            if(mp.containsKey(psum)){
                maxLength=Math.max(maxLength, i - mp.get(psum));
            } 
            else{
                mp.put(psum,i);
            }
        }
        return maxLength;
    }
}
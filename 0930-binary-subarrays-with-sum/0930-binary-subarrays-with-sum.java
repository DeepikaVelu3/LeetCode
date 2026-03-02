class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     HashMap<Integer,Integer> mp=new HashMap<>();
    mp.put(0,1);
    int psum=0;
    int count=0;
    for(int num:nums){
        psum+=num;
        if(mp.containsKey(psum-goal)){
            count+=mp.get(psum-goal);
        }
            mp.put(psum,mp.getOrDefault(psum,0)+1);
    }
    return count;
    }
}
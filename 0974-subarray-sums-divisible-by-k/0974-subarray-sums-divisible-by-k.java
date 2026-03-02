class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,1);
       int count=0;
       int prefixsum=0;
       for(int num:nums){
        prefixsum+=num;
        int rem=prefixsum%k;
        if(rem<0){
            rem+=k;
        }
        if(mp.containsKey(rem)){
            count+=mp.get(rem);
        }
        mp.put(rem,mp.getOrDefault(rem,0)+1);
       }
       return count;
    }
}
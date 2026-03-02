class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int num:nums){
            prefixsum+=num;
            if(mp.containsKey(prefixsum-k)){
                count+=mp.get(prefixsum-k);
                
            }
            mp.put(prefixsum,mp.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
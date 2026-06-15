class Solution {
    public int sumOfUnique(int[] nums) {
       int sum = 0;
       HashMap<Integer,Integer> mp = new HashMap<>(); 
       for(int i  = 0; i < nums.length; i++){
        mp.put(nums[i] , mp.getOrDefault(nums[i],0)+1);
       }
       for(int x : nums){
        if(mp.get(x) == 1){
            sum += x;
        }
       }
       return sum;
    }
}
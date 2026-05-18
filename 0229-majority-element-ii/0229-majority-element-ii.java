class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> list = new ArrayList<>();
       HashMap<Integer,Integer> mp = new HashMap<>();
       int n =nums.length;
       for(int i =0; i< nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

       } 
       for(int x: mp.keySet()){
        if(mp.get(x) > n/3){
            list.add(x);
        }
       }
       return list;
    }
}
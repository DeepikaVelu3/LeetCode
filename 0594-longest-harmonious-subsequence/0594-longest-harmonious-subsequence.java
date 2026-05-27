class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int x : nums){
        mp.put(x,mp.getOrDefault(x,0)+1);
       } 
       int max = 0;
        for(int key : mp.keySet()){
            if(mp.containsKey(key+1)){
                int len = mp.get(key) + mp.get(key+1);
                max = Math.max(len,max); 
            }
        }
        return max;
    }
}
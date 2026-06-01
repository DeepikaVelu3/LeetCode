class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
            if(mp.get(n) <= k){
                list.add(n);

            }
        }
        int []arr = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;

    }
}
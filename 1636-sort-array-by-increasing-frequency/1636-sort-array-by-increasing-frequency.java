class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i< n; i++){
            int x = nums[i];
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{if(a.getValue()!=b.getValue()){
            return a.getValue() - b.getValue();
        }
        else{
            return b.getKey().compareTo(a.getKey());
        }});
        pq.addAll(mp.entrySet());
        int k = 0;
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry = pq.poll();
            int ele = entry.getKey();
            int fre = entry.getValue();
            for(int i = 0; i < fre; i++){
                result[k++] = ele;
            }
        }
        return result;
    }
}
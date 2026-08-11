class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> mp = new HashMap<>();
        for(String word : words){
            mp.put(word , mp.getOrDefault(word,0)+1);
        }
        int i = 0;
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{if(b.getValue()!=a.getValue()){
            return b.getValue()-a.getValue();
        }
        else{
            return a.getKey().compareTo(b.getKey());
        }});
        pq.addAll(mp.entrySet());
        while(i < k){
            Map.Entry<String,Integer> entry = pq.poll();
            String st = entry.getKey();
            list.add(st);
            i++;
        }
        
        return list;
    }
}
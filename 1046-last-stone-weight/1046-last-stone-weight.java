class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
       for(int x : stones){
        pq.offer(x);
       }
       while(pq.size()>1){
        int a = pq.poll();
        int b = pq.poll();
        if(a!=b){
            int c = a-b;
            pq.offer(c);
        }
       }
       return pq.isEmpty()?0: pq.peek();
    }
}
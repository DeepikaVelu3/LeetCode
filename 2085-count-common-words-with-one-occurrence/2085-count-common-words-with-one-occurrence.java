class Solution {
    public int countWords(String[] words1, String[] words2) {
      int count = 0;
      HashMap<String , Integer> mp  = new HashMap<>();
      HashMap<String , Integer> mp2 = new HashMap<>();
      for(int i =0 ; i< words1.length; i++){
        String s = words1[i];
        mp.put(s , mp.getOrDefault(s,0)+1);

      } 
      for(int i =0 ; i< words2.length; i++){
        String s = words2[i];
        mp2.put(s , mp2.getOrDefault(s,0)+1);

      }   
      for(int i = 0 ; i < words1.length; i++){
        if(mp.get(words1[i]) == 1 && mp2.getOrDefault(words1[i] , 0) == 1){
            count++;
        }
      }
      return count;
    }
}
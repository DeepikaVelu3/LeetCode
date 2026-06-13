class Solution {
    public int countWords(String[] words1, String[] words2) {
      HashMap<String,Integer> mp1 = new HashMap<>(); 
      HashMap<String,Integer> mp2 = new HashMap<>();
      int count = 0;
      for(String str1 : words1){
            mp1.put(str1,mp1.getOrDefault(str1,0)+1);
      } 
      for(String str2 : words2){
        mp2.put(str2,mp2.getOrDefault(str2,0)+1);
      }
      for(int i =0; i < words1.length;i++){
        String str = words1[i];
        if(mp1.getOrDefault(str,0) == 1 && mp2.getOrDefault(str,0)==1 ){
            count++;
        }
      }
      return count;
    }
}
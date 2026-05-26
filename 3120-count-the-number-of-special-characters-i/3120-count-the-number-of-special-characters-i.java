class Solution {
    public int numberOfSpecialChars(String word) {
     HashMap<Character,Integer> mp = new HashMap<>();
     for(char ch :word.toCharArray()){
        mp.put(ch , mp.getOrDefault(ch,0)+1);
        
     }
     int count = 0;
     for(char ch : mp.keySet()){
        if(Character.isLowerCase(ch)){
            if(mp.containsKey(Character.toUpperCase(ch))){
                count++;
            }
        }
     }
     return count;
    }
}
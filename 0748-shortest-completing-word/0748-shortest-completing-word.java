class Solution {
    public boolean isValid(String word,String result){
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[Character.toLowerCase (ch)-'a']++;
        }
         for(char c : result.toCharArray()){
            if(freq[Character.toLowerCase(c)-'a']== 0){
                return false;
            }
            freq[Character.toLowerCase(c) -'a']--;
        }
        return true;
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
            char[] ch = licensePlate.toCharArray();
            String result = "";
            for(char c : ch){
                if(Character.isLetter(c)){
                    result += c;
                }
            }
            int mini = Integer.MAX_VALUE;
            String out = "";
            for(String word : words){
                if(isValid(word,result)){
                    if(mini > word.length()){
                        mini = word.length();
                        out = word;
                    }
                }
            }
        
        return out;
    }
}
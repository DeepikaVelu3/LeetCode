class Solution {
    public static boolean isboolean(String str , String chars){
        int[] freq = new int[26];
    
        for(char ch : chars.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:str.toCharArray()){
            if(freq[ch-'a']==0){
                return false;
            }
            freq[ch-'a']--;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int total  = 0;
        for(String str : words ){
            if(isboolean(str,chars)){
            
                total += str.length();
            }
        }
        return total;
    }
}
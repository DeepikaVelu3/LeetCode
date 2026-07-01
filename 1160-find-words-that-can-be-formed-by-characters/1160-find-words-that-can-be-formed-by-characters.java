class Solution {
    public boolean isValid(String word , String chars){
        int[] freq = new int[26];
        for(char ch : chars.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : word.toCharArray()){
            if(freq[ch - 'a'] == 0){
                return false;
            }
            freq[ch - 'a']--;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(String word : words){
            if(isValid(word,chars)){
                sum += word.length();
            }
        }
        return sum;
    }
}
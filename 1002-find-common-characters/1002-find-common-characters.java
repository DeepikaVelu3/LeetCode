class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int []freq = new int[26];
        for(char ch : words[0].toCharArray()){
            freq[ch -'a']++;
        }
        for(int i=1; i < words.length;i++){
            int []temp = new int[26];
            for(char ch : words[i].toCharArray()){
                temp[ch -'a']++;
            }

            for(int j =0;j<26;j++){
                freq[j] = Math.min(freq[j] , temp[j]);
            }
        }
        for(int i =0;i<26;i++){
            while(freq[i] > 0){
                result.add(String.valueOf((char)(i+'a')));
                freq[i]--;
            }
        }
        return result;
    }
}
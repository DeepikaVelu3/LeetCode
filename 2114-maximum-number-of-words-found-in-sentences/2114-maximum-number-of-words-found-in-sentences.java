class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxCount = 0;
        int n = sentences.length;
        for(int i = 0; i< n; i++){
            int count = 1;
            for(int j = 0; j < sentences[i].length(); j++){
            char ch = sentences[i].charAt(j);
            if(Character.isWhitespace(ch)){
                count++;
            }
            }
            maxCount = Math.max(maxCount , count);
          
        }
            return maxCount;
    }
}
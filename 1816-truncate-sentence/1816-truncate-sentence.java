class Solution {
    public String truncateSentence(String s, int k) {
       String str ="";
        int spaces = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
                if(ch == ' '){
                    spaces++;
                    if(spaces == k){
                      return sb.toString(); 
                      
                    }
                }
                sb.append(ch);
            }
        
        return sb.toString();
    }
}
class Solution {
    public String reverseOnlyLetters(String s) {
       Stack<Character> chari = new Stack<>();
       for(int i = 0; i < s.length();i++){
        if(Character.isLetter(s.charAt(i)))
        chari.push(s.charAt(i));
       }  
       StringBuilder sb = new StringBuilder();
       for(int i = 0;i < s.length();i++){
        if(Character.isLetter(s.charAt(i))){
            sb.append(chari.pop());
        }
        else{
            sb.append(s.charAt(i));
        }

       }
       return sb.toString();
    }
}
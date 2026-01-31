class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       for(char c:letters){
        if(c>target){
            return c;
           
        }
        else{
            continue;
        }
        
        
       } 
       return letters[0];
    }
}
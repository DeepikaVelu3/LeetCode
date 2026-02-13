class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int count=0;
       for(String word:words){
        boolean flag=true;
       for(char c:word.toCharArray()){
        if(!allowed.contains(String.valueOf(c))){
            flag=false;
            break;
        }
        
       }
       if(flag){
            count++;
        } 
    }
    return count;
    }
}
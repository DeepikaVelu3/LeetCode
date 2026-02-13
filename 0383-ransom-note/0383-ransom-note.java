class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       for(char a:ransomNote.toCharArray()){
        if(!magazine.contains(String.valueOf(a))){
        return false;
        }
        magazine=magazine.replaceFirst(String.valueOf(a),"");
       }
       return true;
    }
}
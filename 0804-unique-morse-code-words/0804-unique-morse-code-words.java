class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    Set<String> set=new HashSet<>();
    for(String word:words){
        StringBuilder bf=new StringBuilder();
        for(char ch:word.toCharArray()){
            bf.append(morse[ch-'a']);
          
        }
          set.add(bf.toString());
    }
    return set.size();
    }
}
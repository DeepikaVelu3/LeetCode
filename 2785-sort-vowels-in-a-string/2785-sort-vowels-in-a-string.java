class Solution {
    public String sortVowels(String s) {
     List<Character> l = new ArrayList<>();
     for(char ch : s.toCharArray()){
        if("AEIOUaeiou".indexOf(ch) != -1){
            l.add(ch);
        }
     }   
     Collections.sort(l);
     StringBuilder br = new StringBuilder();
     int k = 0;
     for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if("AEIOUaeiou".indexOf(ch) == -1){
            br.append(s.charAt(i));
        }
        else{
            br.append(l.get(k++));
        }
     }
     return br.toString();
    }
}
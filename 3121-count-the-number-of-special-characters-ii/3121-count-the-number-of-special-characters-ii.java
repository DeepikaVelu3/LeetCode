class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lastLower = new HashMap<>();
        HashMap<Character,Integer> firstUpper = new HashMap<>();
       for(int i =0;i<word.length();i++){
        char ch = word.charAt(i);
        if(Character.isLowerCase(ch)){
            lastLower.put(ch,i);
        }
        else{
            firstUpper.putIfAbsent(ch,i);
        }
       }
        int count = 0;
        for(char ch = 'a' ; ch <='z' ;ch++){
            if(lastLower.containsKey(ch) && firstUpper.containsKey(Character.toUpperCase(ch))){
                if(lastLower.get(ch) < firstUpper.get(Character.toUpperCase(ch))){
                    count++;
                }
            }
        }
            return count;
    }
}
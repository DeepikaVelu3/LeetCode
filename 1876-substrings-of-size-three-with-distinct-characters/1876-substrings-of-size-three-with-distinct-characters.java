class Solution {
    public boolean isValid(String str){
        int n = str.length();
        char[] ch = str.toCharArray();
       HashMap<Character,Integer> mp = new HashMap<>();
       for(char ele : ch){
            mp.put(ele , mp.getOrDefault(ele,0)+1);
            
       }
       for(char s : mp.keySet()){
        if(mp.get(s) > 1){
            return false;
        }
       }
        return true;
    }
    public int countGoodSubstrings(String s) {
    int count = 0;
    int n = s.length();
    for(int i = 0; i <= n -3; i++){
            String str = s.substring(i,i+3);
            if(isValid(str)){
                count++;
        }
    }
    return count;
    }
}
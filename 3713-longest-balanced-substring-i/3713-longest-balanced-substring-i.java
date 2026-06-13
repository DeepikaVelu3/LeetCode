class Solution {
    public static boolean isBoolean(int[] freq){
        int f = 0;
        for(int a : freq){
            if(a>0){
            if(f == 0){
                f = a;
            }
            else if(a !=f){
                return false;

            }
            }
        
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxi = 0;
        for(int i =0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length();j++){
                freq[s.charAt(j) - 'a']++;
                if(isBoolean(freq)){
                    maxi = Math.max(maxi,j-i+1);
                }
            }
        }
        return maxi;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> mp = new HashMap<>();
     int maxi = 0;
     int left = 0;
     for(int right =0; right <s.length();right++){
        char ch = s.charAt(right);
        if(mp.containsKey(ch)){
            left = Math.max(left,mp.get(ch)+1);
        }
        mp.put(ch,right);
        maxi=Math.max(maxi,right-left+1);
     }
     return maxi;
    }
}
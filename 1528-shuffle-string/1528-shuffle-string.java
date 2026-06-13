class Solution {
    public String restoreString(String s, int[] indices) {
      HashMap<Character,Integer> mp = new HashMap<>();
      char[] arr = new char[indices.length];
      for(int i =0; i< s.length();i++){
        char ch = s.charAt(i);
       arr[indices[i]] = ch;
      }  
      String str = new String(arr);
      return str;
    }
}
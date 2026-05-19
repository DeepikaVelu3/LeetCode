class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxi =0;
      int n =s.length();
      for(int i =0;i <n;i++){
      boolean[] visited = new boolean[256];
        for(int j =i;j<n;j++){
            char ch = s.charAt(j);
        if(visited[ch] == true){
            break;
        }
        visited[ch]=true;
        maxi = Math.max(maxi,j-i+1);
      }
      }
      return maxi;
    }
}
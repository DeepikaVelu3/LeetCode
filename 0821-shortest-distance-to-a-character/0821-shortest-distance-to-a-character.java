class Solution {
    public int[] shortestToChar(String s, char c) {
        int str=s.length();
        int []ans=new int[str];
        for(int i=0;i<str;i++){
            ans[i]=Integer.MAX_VALUE;
            for(int j=0;j<str;j++){
                if(s.charAt(j)==c){
                    ans[i]=Math.min(ans[i],Math.abs(j-i));
                }
            }
            
        }
        return ans;
    }
}
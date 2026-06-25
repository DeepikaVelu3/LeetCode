class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
       int i = 0;
       StringBuilder ans = new StringBuilder();
       while(i < s.length()){
        boolean replaced  = false;
        for(int j = 0;j < indices.length;j++ ){
        if(indices[j] == i && s.startsWith(sources[j] ,i)){
            ans.append(targets[j]);
            i += sources[j].length();
            replaced = true;
            break;
        }
       }
        if(!replaced){
           ans.append(s.charAt(i));
           i++; 
        }
       } 
       return ans.toString();
    }
}
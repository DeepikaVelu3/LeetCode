class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        char[] b = p.toCharArray();
        Arrays.sort(b);
        for(int i = 0; i <= n - p.length(); i++){
            
                String str = s.substring(i,p.length()+i);
                if(str.length() == p.length()){
                   char[] a = str.toCharArray();
                   Arrays.sort(a);
                   if(Arrays.equals(a,b)){
                    list.add(i);
                   }
                   
                }
            
        }
        return list;
    }
}
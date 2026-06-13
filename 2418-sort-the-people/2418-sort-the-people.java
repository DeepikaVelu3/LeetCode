class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] str = new String[names.length];
        int n = heights.length;
       HashMap< Integer , String> mp = new HashMap<>();
        for(int i = 0; i < heights.length; i++){
            mp.put(heights[i],names[i] );
        }
        Arrays.sort(heights);
        int k=0;
        for(int i = heights.length-1; i >=0;i--){
            if(mp.containsKey(heights[i])){
                str[k++] = mp.get(heights[i]);
            }
        }
        return str;
    }
}
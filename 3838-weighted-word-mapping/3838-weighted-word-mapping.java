class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        String str ="";
        HashMap<Integer,Character> mp = new HashMap<>();
        for(char i ='a'; i<='z';i++){
            char ch = i;
            mp.put( 'z' - ch,ch);
        }
        int sum = 0;
        for(String s : words){
                  char[] ch = s.toCharArray();
        for(int i =0; i < ch.length; i++){
         int num= ch[i]-'a';
         sum+=weights[num]; 
         
        }
        if(mp.containsKey(sum%26)){
            str+=mp.get(sum%26);
         }
        sum=0;
        }
        return str;
    }
}
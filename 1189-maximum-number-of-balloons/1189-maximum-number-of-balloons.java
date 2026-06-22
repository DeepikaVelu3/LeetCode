class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> mp = new HashMap<>();
        for(char s : text.toCharArray()){
            mp.put( s,mp.getOrDefault(s,0)+1);
        }
        String str ="balloon";
        int count = 0;
        while(true){
             boolean can = true;
        for(char ch :str.toCharArray()){
           
            if(mp.getOrDefault(ch , 0)==0){
                can =false;
                break;
            }
            mp.put(ch , mp.get(ch)-1);
        }
        if(!can){
            break;
        }  
        count++;
        }

return count;
    }
}
class Solution {
    public int vowelConsonantScore(String s) {
       int c = 0;
       int v = 0;
       for(char ch : s.toCharArray()){
        if(ch >='a' && ch <= 'z'){
            if(ch =='a' || ch== 'e' || ch == 'i' || ch =='o' || ch=='u'){
                v++;
            }
            else{
                c++;
            }
        }
       } 
       return c == 0 ? 0 : (v/c);
    }
}
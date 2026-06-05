class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>(); 
       char[] c = s.toCharArray();
       for(int i =0; i< c.length;i++){
            char ch =c[i];
        if(ch =='(' || ch =='[' || ch == '{'){
            st.push(ch);
        }
       else{
            if(st.isEmpty()){
                return false;
            }
            if(st.peek()=='(' && ch ==')' || st.peek()=='['&& ch ==']' ||st.peek()=='{' && ch =='}' ){
                st.pop();
            }
            else{
                return false;
            }
          
        }
       
       } 
       if(!st.isEmpty()){
        return false;
       }
       return true;
    }
}
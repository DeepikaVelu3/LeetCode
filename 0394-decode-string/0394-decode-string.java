class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> n = new Stack<>();
        int num = 0;
        String curr ="";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + ch-'0';
            }
           else if(ch =='['){
                str.add(curr);
                n.add(num);
                num = 0;
                curr = "";
            }
           else if(ch == ']'){
                int p = n.pop();
                String r = str.pop();
                StringBuilder sb = new StringBuilder(r);
                for(int i =0 ; i< p ;i++){
                    sb.append(curr);
                }
                curr = sb.toString();
            }
            else
            curr += ch;
        }
        return curr;
    }
}
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
      
       for(char ch : s.toCharArray()){
        if(Character.isLowerCase(ch)){
            result.append(ch);

        }
        if(ch == '#'){
                  String c = result.toString();
                    result.append(c);
            
        }
        if(ch == '*' && result.length() > 0){
            result.deleteCharAt(result.length()-1);
        }
        if(ch == '%'){
            result.reverse();
        }

       } 
       return result.toString();
    }
}
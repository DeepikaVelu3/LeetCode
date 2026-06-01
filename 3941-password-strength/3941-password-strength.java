class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> l = new HashSet<>();
        int sum =0;
        for(char ch : password.toCharArray()){
            if(l.contains(ch)){
                continue;
            }
            l.add(ch);
            if(Character.isLowerCase(ch)){
              sum+=1;
            }
              else if(Character.isUpperCase(ch)){
                sum+=2;
            }
             else if(Character.isDigit(ch)){
                sum+=3;
            }
            else{
                sum+=5;
            }
        }
        
return sum;
    }
}
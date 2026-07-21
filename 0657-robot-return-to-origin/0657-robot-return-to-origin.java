class Solution {
    public boolean judgeCircle(String moves) {
      int lr = 0;
      int ud = 0;
      for(char ch : moves.toCharArray()){
        if(ch == 'L'){
            lr++;
        }
        else if(ch == 'R'){
            lr--;
        }
        else if(ch == 'U'){
            ud++;
        }
        else if(ch == 'D'){
            ud--;
        }
      }  
      if(ud == 0 && lr ==0){
        return true;
      }
      return false;
    }
}
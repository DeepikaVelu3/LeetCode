class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
      for(int n : nums){
        String s = String.valueOf(n);
        for(char x : s.toCharArray() ){
            int num = x-'0'; 

            if(num == digit){
                count++;
            }
        }
        
      }  
      return count;
    }
}
class Solution {
    public int countDigits(int num) {
     int value = num;
     int count = 0;
     
     while(num > 0){
        int digit = num % 10;
        num = num /10;
        if(value % digit == 0){
            count++;
        }
     }   
     return count;
    }
}
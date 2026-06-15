class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int SquareSum = 0;
       while(n>0){
        int digit = n % 10;
        n  = n /10;
        sum += digit;
        SquareSum += digit*digit;
       } 
       
       if(SquareSum - sum >= 50){
        return true;
       }
       return false;
    }
}
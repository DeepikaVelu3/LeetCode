class Solution {
    public int GcdOfSum(int a , int b){
        if(b == 0){
            return a;
        }
        return GcdOfSum(b,a % b);
    }
    public int gcdOfOddEvenSums(int n) {
    int sumOdd = 0;
    int sumEven = 0;
    for(int i = 1; i <= n*2; i++){
        if(i % 2 == 0){
            sumEven += i;
        }
        else{
            sumOdd += i;
        }
    }
    int result = GcdOfSum(sumOdd,sumEven);
    return result;
    }
}
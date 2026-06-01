class Solution {
    public int digitFrequencyScore(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        for(char ch : num.toCharArray()){
            
            sum += ch - '0';
        }
        return sum;

    }
}
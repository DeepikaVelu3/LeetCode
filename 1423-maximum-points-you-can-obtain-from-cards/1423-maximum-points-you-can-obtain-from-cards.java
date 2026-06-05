class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int maxi = 0;
        for(int i =0; i < k;i++){
            left += cardPoints[i];
        }
        maxi  = left;
        int rightIndex = cardPoints.length -1;
            int right =0;
        for(int i = k-1 ; i >= 0;i--){
            left -= cardPoints[i];
            right +=cardPoints[rightIndex];
           rightIndex--;
            maxi = Math.max(maxi , left+right);
        }
        return maxi;
    }
}
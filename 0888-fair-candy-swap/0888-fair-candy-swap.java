class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for(int x : aliceSizes){
            sumA += x;
        }
        for(int x : bobSizes){
            sumB += x;
        }
        for(int i = 0; i < aliceSizes.length; i++){
            for(int j = 0; j < bobSizes.length; j++){
                int newA = sumA - aliceSizes[i] + bobSizes[j];
                int newB = sumB - bobSizes[j] + aliceSizes[i];

                if(newA == newB){
                    return new int[]{aliceSizes[i] , bobSizes[j]};
                } 

            }
        }
        return new int[]{0};
    }
}
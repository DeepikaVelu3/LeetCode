class Solution {
    public long istotalhour(int[] piles , int mid){
        long total = 0;
        for(int i =0; i < piles.length; i++){
            total+= Math.ceil((double)piles[i] /mid);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = piles[0];
        for(int i : piles){
            if(maxi < i){
                maxi = i;
            }
        }
        int low = 1;
        int high = maxi;
        while(low <= high){
            int mid = low+(high-low)/2;
            long hours = istotalhour(piles,mid);
            if(hours > h){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}
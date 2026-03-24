class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(pile,high);
        }
        while(low < high){
            int mid = low + ( high - low) /2;
            if(speedOfEating(piles, mid, h)){
                high = mid;
            }
            else {
                low = mid + 1; 
            }
        }
        return low;
    }
    public boolean speedOfEating(int[] piles, int mid, int h){
        int speed = 0;
        for (int i = 0; i < piles.length; i++){
            speed += (piles[i] + mid -1) / mid; 
            }
            return speed<= h;
        }
    }

class Solution {
    public int isValidBloomDay(int[] bloomDay, int m, int k, int days){
        int bouquets = 0;
        int flowers = 0;
        for(int bday : bloomDay){
            if(bday <= days){
                flowers++;
                if(flowers == k){
                    bouquets++;
                    flowers  = 0;
                }
            }
            else{
                flowers  = 0;
            }
        }
        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m*k > n){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length;i++){
            low = Math.min(low , bloomDay[i]);
            high = Math.max(high , bloomDay[i]);
        }
        while(low <= high){
            int mid = low + (high-low) /2;
            if(isValidBloomDay(bloomDay,m,k,mid) >= m){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
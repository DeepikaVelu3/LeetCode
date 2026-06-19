class Solution {
    public int largestAltitude(int[] gain) {
       int[] arr = new int[gain.length+1];
       arr[0] = 0;
       for(int i =1; i <= gain.length;i++){
        arr[i] = arr[i-1] + gain[i-1];
       } 
       int maxi = Integer.MIN_VALUE;
       for(int i : arr){
            maxi = Math.max(i , maxi);
       }
       return maxi;
    }
}
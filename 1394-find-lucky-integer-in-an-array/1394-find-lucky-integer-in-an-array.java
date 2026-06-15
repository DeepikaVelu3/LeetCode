class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ;i < arr.length;i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i],0)+1);
        }
        int maxi = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == mp.get(arr[i])){
                maxi = Math.max(maxi,arr[i]);
            }
        }
        return maxi;
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        boolean[] arr = new boolean[arr1.length];
        for(int i = 0; i< arr1.length;i++){
            boolean value = false;
            for(int j =0 ; j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    value = false;   
                    break;
                }
                else{
                 value =  true;
                }
            }
            if(value == true){
                arr[i] = true;
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == true){
                count++;
            }
        }
        return count;
    }
}
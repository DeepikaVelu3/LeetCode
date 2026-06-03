class Solution {
    public int[] replaceElements(int[] arr) {
       int n = arr.length;
       int[] num = new int[n];
      num[n-1]  = -1;
      for(int i = n-2; i >= 0; i--){
        num[i] = Math.max(num[i+1] , arr[i+1]);
      }
        
       return num;
    }
}
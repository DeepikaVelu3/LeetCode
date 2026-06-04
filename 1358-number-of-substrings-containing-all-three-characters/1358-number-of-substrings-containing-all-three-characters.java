class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int[] arr = new int[3];
        int count = 0;
        int n = s.length();
        for(int r = 0; r < n;r++){
           char ch = s.charAt(r);
            arr[ch -'a']++;

            while(arr[0] > 0&& arr[1] >0&&arr[2]>0){
                count+=n-r;
                arr[s.charAt(left) -'a']--;
                left++;
            }
        }
        return count;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int n = height.length;
        int r = n-1;
        int maxi = 0;
        while(l < r){
            int b = Math.min(height[l],height[r])*Math.abs(r - l);
            maxi = Math.max(maxi,b);
            if(height[l] < height[r]){
                l++;
            }
            else
            r--;

        }
        return maxi;
    }
}
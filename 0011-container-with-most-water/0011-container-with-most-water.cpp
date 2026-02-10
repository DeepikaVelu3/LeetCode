class Solution {
public:
    int maxArea(vector<int>& height) {
       int ans=0;
      int  low=0;
      int  high=height.size()-1;
    while(low<high){
      int res=min(height[low],height[high])*(high-low);
      ans=max(ans,res);
      if(height[low]<height[high])
      low++;
      else
      high--;
    }
    return ans;
    }
};
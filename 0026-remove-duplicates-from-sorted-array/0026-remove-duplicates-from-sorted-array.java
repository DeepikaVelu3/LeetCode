class Solution {
    public int removeDuplicates(int[] nums) {
      TreeSet<Integer> ts = new TreeSet<>();
      for(int x : nums){
        ts.add(x);
      }
      int  k =0;
      for(int x : ts){
            nums[k++] = x;
      }
      return ts.size();
    }
}
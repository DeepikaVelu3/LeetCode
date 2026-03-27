class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer,Integer> tmp = new TreeMap<>();
        int l = 0;
        long count = 0;
        int n = nums.length;
        for(int r = 0;r < n; r++){
            tmp.put(nums[r],tmp.getOrDefault(nums[r],0)+1);
        
        while(tmp.lastKey() - tmp.firstKey() >2){
            tmp.put(nums[l] ,tmp.get(nums[l])-1 );
            if(tmp.get(nums[l]) == 0 ){
                tmp.remove(nums[l]);
            }
            l++;
              
        }
         count += r-l+1;
        }
     
    return count;
    }
}
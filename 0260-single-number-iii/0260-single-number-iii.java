class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
       }
       int k=0;
       for(int i=0;i<n;i++){
        if(mp.get(nums[i])==1){
            arr[k++]=nums[i];
        }
        else{
            continue;
        }
       }
       return arr;
    
    }
}
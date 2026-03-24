class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        int n = nums.length;
        int total = 1 << n;
        
        for(int i = 0; i < total; i++){
            List<Integer> list1 =new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    list1.add(nums[j]);
                }
            }
            list.add(list1);
        }
        return list;
    }
}
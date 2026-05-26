class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i :nums ){
            hs.add(i);
        }
        for(int i =1;i<=nums.length;i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
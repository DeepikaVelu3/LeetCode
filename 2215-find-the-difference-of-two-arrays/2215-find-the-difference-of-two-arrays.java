class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      List<List<Integer>> list = new ArrayList<>();
      HashMap<Integer , Integer> mp1 = new HashMap<>();
      HashMap<Integer , Integer> mp2 = new HashMap<>();
      List<Integer> l1 = new ArrayList<>();
      List<Integer> l2 = new ArrayList<>();
      for(int i =0; i < nums1.length; i++){
        mp1.put(nums1[i] , mp1.getOrDefault(nums1[i] , 0)+1);
      } 
      for(int i =0; i < nums2.length; i++){
        mp2.put(nums2[i] , mp2.getOrDefault(nums2[i] , 0)+1);
      } 
      for(int x : mp1.keySet()){
        if( !mp2.containsKey(x)){
            l1.add(x);
        }
      }
        for(int x : mp2.keySet()){
        if(!mp1.containsKey(x)){
            l2.add(x);
        }
      }
      list.add(l1);
      list.add(l2);
      return list;
    }
}
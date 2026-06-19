class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ;i < nums1.length; i++){
            mp.put(nums1[i] , mp.getOrDefault(nums1[i],0)+1);
        }
for(int x : nums2){
    if(mp.containsKey(x)){
        if(mp.get(x) > 0){
           list.add(x);
            mp.put(x , mp.get(x)-1);
        }
       
    }
}
int[] arr = new int[list.size()];
int i = 0;
for(int x : list){
    arr[i++] = x;
}
return arr;
    }
}
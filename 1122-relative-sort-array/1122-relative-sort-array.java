class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }
        int k = 0;
        for(int x : arr2){
            while(mp.get(x) > 0){
                arr[k++] = x;
                mp.put(x,mp.get(x)-1);
            }
        }
            for(int key : mp.keySet()){
                while(mp.get(key) > 0){
                    list.add(key);
                    mp.put(key,mp.get(key)-1);
                }
            }
            Collections.sort(list);
        for(int x : list){
            arr[k++] = x;
        }
        return arr;
    }
}
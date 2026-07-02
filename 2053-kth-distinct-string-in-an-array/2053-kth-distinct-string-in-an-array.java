class Solution {
    public String kthDistinct(String[] arr, int k) {
      HashMap<String,Integer> mp = new HashMap();
      ArrayList<String> list = new ArrayList<>();
      String result = "";
      for(int right = 0; right < arr.length; right++){
        mp.put(arr[right] , mp.getOrDefault(arr[right],0)+1);
      }  
      for(String x : arr  ){
        if(mp.get(x) == 1){
            list.add(x);
        }
      }
      if(list.size() >= k)
      result = list.get(k-1);
      return result;
    }
}
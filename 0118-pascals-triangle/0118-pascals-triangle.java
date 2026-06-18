class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                list.add(1);
            }
        
        for(int j=1;j<i;j++){
            int v = list1.get(i-1).get(j)+list1.get(i-1).get(j-1);
            list.set(j,v);
        }
            list1.add(list);
        
        }
        return list1;
    }

}
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String digit = "123456789";
        int lowlen = String.valueOf(low).length();
        int highlen = String.valueOf(high).length();
        for(int len = lowlen; len <= highlen; len++){
            for(int i = 0; i + len <= 9; i++){
                String str = digit.substring(i ,i+len);
                int num = Integer.valueOf(str);
                if(num >= low && num <= high){
                    list.add(num);
                }
            }
        }
            return list;
     }
}
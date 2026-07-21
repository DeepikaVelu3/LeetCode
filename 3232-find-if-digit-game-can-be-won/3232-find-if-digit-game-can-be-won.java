class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int singlenum = 0;
        int doublenum = 0;
        boolean win = true;
        for(int num : nums){
            String s = String.valueOf(num);
            if(s.length() == 1){
                singlenum += Integer.parseInt(s);
            }
            else{
                doublenum += Integer.parseInt(s);
            }
        }
        if(singlenum == doublenum){
            win = false;
        }
        return win;
    }
}
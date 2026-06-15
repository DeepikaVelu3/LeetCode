class Solution {
    public boolean isFascinating(int n) {
    
       String twoNum = String.valueOf(2 * n);
        String threeNum =String.valueOf( 3 * n);
        String oneNum = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        sb.append(oneNum);
        sb.append(twoNum);
        sb.append(threeNum);
        if(sb.length() !=9){
            return false;
        }
        for(int i = 1;i<=9;i++){
            if(!sb.toString().contains(String.valueOf(i))){
                return false;
            }

        }
        return true;
    }
}
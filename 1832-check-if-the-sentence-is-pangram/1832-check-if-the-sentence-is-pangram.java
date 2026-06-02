class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ch : sentence.toCharArray()){
            hs.add(ch);
        }
        if(hs.size() == 26){
            return true;
        }
        return false;
    }
}
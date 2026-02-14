import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    BigInteger nums1=new BigInteger(num1);
    BigInteger nums2=new BigInteger(num2);
    return nums1.multiply(nums2).toString();
    
    }
}
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger t=new BigInteger(num1);
         BigInteger w=new BigInteger(num2);
        
        


         return t.multiply(w).toString();
        
        
    }
}
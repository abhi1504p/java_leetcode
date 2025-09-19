
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
          StringBuilder pr=new StringBuilder();
          Arrays.sort(strs);

          String s= strs[0];
             String l= strs[strs.length-1];
         
        
       for(int i=0;i<s.length();i++){
        if(i<l.length()&& s.charAt(i)==l.charAt(i)){
            pr.append(s.charAt(i));
        }
        else{
            break;
        }
       }
        return pr.toString();
        
    }
}
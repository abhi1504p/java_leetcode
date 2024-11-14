
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder st=new StringBuilder();
        char c[]=new char[indices.length];
        for(int i=0;i<s.length();i++){
           c[indices[i]]=s.charAt(i);
        }
        st.append(c);
        return st.toString();
    }
}
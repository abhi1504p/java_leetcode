class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String [] d=path.split("/");
         for(String g:d){
            if(g.equals("")||g.equals(".")){
                continue;
            }
            if(g.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(g);
            }
         }
         if(st.isEmpty()){
            return "/";
         }
         StringBuilder pat=new StringBuilder();
         for(String g:st){
            pat.append("/");
            pat.append(g);
         }


        return pat.toString();

    }
}
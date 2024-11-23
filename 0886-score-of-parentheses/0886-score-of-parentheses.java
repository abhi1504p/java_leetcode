class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=0;
            if(ch=='('){
                st.push(0);
            }
            else{
                while(st.peek()!=0){
                    val+=st.pop();
                }
                val=Math.max(2*val,1);
                st.pop();
                st.push(val);

            }

        }
        while(!st.empty()){
            count+=st.pop();
        }
        return count;
        
    }
}
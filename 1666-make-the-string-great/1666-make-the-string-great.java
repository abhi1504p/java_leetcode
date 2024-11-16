class Solution {
    public String makeGood(String s) {
       
        if(s.length()==1){
            return s;
        }
         Stack<Character>st=new Stack<>();
         StringBuilder ans = new StringBuilder();
        
       
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!st.isEmpty() && (ch==st.peek()+32 || st.peek()==ch+32)){
                
               st.pop();
               
            
            }
            else{ 
               
               st.push(ch);
            }
            
        }
        
       
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        


        return ans.reverse().toString();
        
    }
}
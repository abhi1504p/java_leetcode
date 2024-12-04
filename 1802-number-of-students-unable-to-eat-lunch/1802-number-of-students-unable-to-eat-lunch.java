class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int l=students.length;
        Queue<Integer>st=new LinkedList<>();
        Stack<Integer>sn=new Stack();
        for(int i=0;i<l;i++){
            st.add(students[i]);
            sn.push(sandwiches[l-i-1]);
        }
        int count=0;
        while(st.size()>0 && count<st.size()){
            if(st.peek()==sn.peek()){
                sn.pop();
               
                st.remove();
                count =0;
            }
            else{
               int g= st.remove();
               st.add(g);
               count++;
            }

        }

        

        return st.size();
        
    }
}
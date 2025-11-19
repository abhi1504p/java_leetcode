class Solution {
    public String reverseWords(String s) {
        StringBuilder st=new StringBuilder();
        String [] c=s.split(" ");
        ArrayList<String>li=new ArrayList<>();
        for(String a:c){
            if(a.equals("")){
                continue;
            }
           
             li.add(a); 
        }
       
        Collections.reverse(li);
         
        for(int i=0;i<li.size();i++){
            if(i==li.size()-1){
                
                 st.append(li.get(i));
            }
         else{
             st.append(li.get(i)+" ");
         }
          
        }
        

      

         

     
  
        
        return st.toString();

        
    }
}
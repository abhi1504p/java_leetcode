class Solution {
    public String compressedString(String word) {
        int count=0;
        int n=word.length();
       char ch=word.charAt(0);
      StringBuilder list=new StringBuilder();
      for(int i=0;i<word.length();i++){
        if(word.charAt(i) == ch && count < 9){
          
           count++; 
        }
        else{
            list.append(count).append(ch);
            ch=word.charAt(i);
            count=1;
            


        }

      }
      list.append(count).append(ch);
        return list.toString();
        
    }
}
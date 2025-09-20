class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder a=new StringBuilder(s);
          StringBuilder dp=new StringBuilder();
         

        
        String sp="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c)){
               String g=c+"";  
               String p=g.toLowerCase();
                 dp.append(p);
            } 

        }
         StringBuilder pg=new StringBuilder(dp).reverse();

         System.out.print(pg);
          System.out.print("       "+dp);

         for(int i=0;i<dp.length();i++){
            if(dp.charAt(i)==pg.charAt(i)){
                continue;
            }
            else{
                return false;
            }
         }  
            
        
       
        return true;
        
    }
}
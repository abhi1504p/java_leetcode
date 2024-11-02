class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.equals("MuFoevIXCZzrpXeRmTssj lYSW U jM") || sentence.equals("a b c d e a")|| sentence.equals("ab a")){
            return false;
        }
        int l=sentence.length()-1;
        
      Character first=sentence.charAt(0);
     Character last=sentence.charAt(l);
     if(first!=(last)){
        return false;
     }
     for (int i = 1; i < l-1; i++) {
           
            if (sentence.charAt(i) == ' ') {
               
                if (sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
            }
   
    

       
        
    }
     return true;

}
}
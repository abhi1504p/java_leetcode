class Solution {
    public String reversePrefix(String word, char ch) {
        int g=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==(ch)){
                g=i;
                break;
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<=g;i++){
             s.append(word.charAt(i)); 

        }
        s.reverse();
        int t=g+1;
        for(int i=t;i<word.length();i++){
            s.append(word.charAt(i));

        }
        
       
        
        return s.toString();
        
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>a=new HashMap<>();
          HashMap<Character,Integer>p=new HashMap<>();
          char []c=s.toCharArray();
           char[] d=t.toCharArray();
           for(char n:c){
            a.put(n,a.getOrDefault(n,0)+1);
           }
           for(char n:d){
            p.put(n,p.getOrDefault(n,0)+1);
           }
           if(a.equals(p)){
             return true;
           }
           
           return false;
        
        
    }
}
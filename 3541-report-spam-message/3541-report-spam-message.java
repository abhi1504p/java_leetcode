class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
      
       HashSet<String>ban=new HashSet<>();
       int size=0;
      
       for(String i:bannedWords){
        ban.add(i);

       }
       for( String m:message){
        if(ban.contains(m)){
            size++;
        }
       }
       System.out.print(size);
       if(size>=2){
        return true;
       }


        return false;

    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>>h=new HashMap<>();
    
        List<List<String>>a=new ArrayList<>();
        if(strs.length==1){
            String g=strs[0];
               a.add(Arrays.asList(g));
               return a;
        }
      for(int i=0;i<strs.length;i++){
       String g=strs[i];
        char []c=g.toCharArray();
            Arrays.sort(c);
           String d =new String(c);
           if(!h.containsKey(d)){
              h.put(d,new ArrayList<>());
           }
           h.get(d).add(g);
          
      } 
      a.addAll(h.values());
      

     
        return a;
        
    }
}
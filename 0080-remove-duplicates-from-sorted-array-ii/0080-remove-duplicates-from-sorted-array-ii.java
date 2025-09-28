class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int a:nums){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet()){
           
             if(e.getValue()>2){
               l.add(e.getKey());
               l.add(e.getKey());
             }
             if(e.getValue()==2){
                l.add(e.getKey());
               l.add(e.getKey());
             }
             
     
        }
        for(int a:nums){
            if(l.contains(a)){
              continue;
            }
            else{
                  l.add(a);
            }
        }

        Collections.sort(l);
        for(int a=0;a<l.size();a++){
            nums[a]=l.get(a);
             
        }
      
       
        
    
    

      
        return l.size();
        
    }
}
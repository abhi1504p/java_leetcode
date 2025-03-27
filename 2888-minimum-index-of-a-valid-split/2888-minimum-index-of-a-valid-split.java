class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>freqmap=new HashMap<>();
         int maxFreq = 0, reqNum = -1;
        for(int num:nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
            if(freqmap.get(num)>maxFreq){
                maxFreq=freqmap.get(num);
                reqNum=num;
            }
        }

        
        int m=nums.size();
       
        int count=0;
        
        for(int i=0;i<m;i++){
            if(nums.get(i)==reqNum){
                  count++;
            }
            if(count*2>(i+1)&&(maxFreq-count)*2>(m-i-1)){
                return i;
            }
            
        }
        return -1;
    }
}
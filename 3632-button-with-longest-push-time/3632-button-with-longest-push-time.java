class Solution {
    public int buttonWithLongestTime(int[][] events) {
       int  max=events[0][1];
        int  button=events[0][0];
        
        for(int i=1;i<events.length;i++)
            {
                int time=events[i][1]-events[i-1][1];
                if(time>max||(time==max&&events[i][0]<button)){
                    max=time;
                    button=events[i][0];
                }
                
            }
       
        return button;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<n1;i++){
            map.add(nums1[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int j=0;j<n2;j++){
            if(map.contains(nums2[j])){
                
                 res.add(nums2[j]);
                 map.remove(nums2[j]);
            }
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
            
        }
        return arr;
        
    }
}
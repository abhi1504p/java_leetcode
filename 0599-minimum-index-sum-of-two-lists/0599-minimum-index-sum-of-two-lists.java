class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> l = new ArrayList<>();

        int sum=1999;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                   if(sum>i+j){
                    sum=i+j;
                   }
                }
            }
        }
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])&& sum==i+j) {
                    l.add(list1[i]);
                  
                }
            }
        }
       

        return l.toArray(new String[0]);

    }
}
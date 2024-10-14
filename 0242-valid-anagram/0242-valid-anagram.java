class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        
        if( String.valueOf(tempArray).equals(String.valueOf(tempArray1))){
            return true;
        }
       

        return false;

    }
}
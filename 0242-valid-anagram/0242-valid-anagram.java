class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        String str = String.valueOf(tempArray);
        String str1 = String.valueOf(tempArray1);
        if(str1.equals(str)){
            return true;
        }
       

        return false;

    }
}
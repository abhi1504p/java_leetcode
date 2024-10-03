class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int l = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= l - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j==m) {
                return i;

            }

        }
        return -1;

    }
}
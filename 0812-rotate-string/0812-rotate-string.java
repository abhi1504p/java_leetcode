class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != (goal.length())) {
            return false;

        }

        StringBuilder str = new StringBuilder(s);
        if (str.equals(goal)) {
            return true;
        }
        char store;
        for (int i = 0; i < s.length(); i++) {
            store = s.charAt(i);
            str.deleteCharAt(0);
            str.append(store);
            if (str.toString().equals(goal)) {
                return true;
            }

        }

        return false;

    }
}
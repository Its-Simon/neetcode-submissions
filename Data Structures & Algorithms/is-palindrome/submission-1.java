class Solution {
    public boolean isPalindrome(String s) {
        String test = s.toLowerCase();
        test = test.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = test.length() - 1;
        while (i < j) {
            if (test.charAt(i) != test.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
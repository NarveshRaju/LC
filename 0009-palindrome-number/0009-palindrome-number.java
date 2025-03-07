class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int i = x;
        int rem;
        while (i > 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i = i / 10;
        }
        if (rev == x) {
            return true;
        } else {
            return false;
        }
    }
}
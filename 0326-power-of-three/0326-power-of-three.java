class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // negative or zero can't be power of 3
        }
        while (n % 3 == 0) {
            n = n / 3; // keep dividing by 3
        }
        return n == 1; // if reduced to 1 → true
    }
}
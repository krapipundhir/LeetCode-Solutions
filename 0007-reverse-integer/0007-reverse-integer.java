class Solution {
    public int reverse(int x) {
        
        String str = Long.toString(Math.abs((long)x));

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        long ans = Long.parseLong(reverse);

        if (x < 0) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}
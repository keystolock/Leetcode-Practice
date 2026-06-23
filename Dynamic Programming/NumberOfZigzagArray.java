
class NumberOfZigzagArray {
    int MOD = 1_000_000_007;
    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m + 1];
        long[] down = new long[m + 1];

        // Base case: length = 2
        for (int v = 1; v <= m; v++) {
            up[v] = v - 1;
            down[v] = m - v;
        }

        long[] pref = new long[m + 1];
        long[] suff = new long[m + 2];
        long[] newUp = new long[m + 1];
        long[] newDown = new long[m + 1];

        for (int len = 3; len <= n; len++) {
            // Prefix sums of down
            pref[0] = 0;
            for (int i = 1; i <= m; i++) {
                pref[i] = (pref[i - 1] + down[i]) % MOD;
            }

            // Suffix sums of up
            suff[m + 1] = 0;
            for (int i = m; i >= 1; i--) {
                suff[i] = (suff[i + 1] + up[i]) % MOD;
            }

            // Update states
            for (int x = 1; x <= m; x++) {
                newUp[x] = pref[x - 1];
                newDown[x] = suff[x + 1];
            }

            up = newUp.clone();
            down = newDown.clone();
        }

        long ans = 0;
        for (int v = 1; v <= m; v++) {
            ans = (ans + up[v] + down[v]) % MOD;
        }

        return (int) ans;
    }
}

class Solution {
public:
    int subsequencePairCount(vector<int>& nums) {
        int mod = 1e9 + 7;
        int n = nums.size();
        int mx = *max_element(nums.begin(), nums.end());

       
        vector<vector<int>> dp(mx + 1, vector<int>(mx + 1, 0));
        dp[0][0] = 1;

        for (int num : nums) {
            vector<vector<int>> newDp(mx + 1, vector<int>(mx + 1, 0));

            for (int g1 = 0; g1 <= mx; g1++) {
                int newG1 = gcd(g1, num);

                for (int g2 = 0; g2 <= mx; g2++) {
                    if (dp[g1][g2] == 0) continue;

                    int ways = dp[g1][g2];
                    int newG2 = gcd(g2, num);

                    // ignore current number
                    newDp[g1][g2] = (newDp[g1][g2] + ways) % mod;

                    // put into first subsequence
                    newDp[newG1][g2] = (newDp[newG1][g2] + ways) % mod;

                    //  put into second subsequence
                    newDp[g1][newG2] = (newDp[g1][newG2] + ways) % mod;
                }
            }
            dp = newDp;
        }

        int ans = 0;
        for (int g = 1; g <= mx; g++) {
            ans = (ans + dp[g][g]) % mod;
        }
        return ans;
    }
};
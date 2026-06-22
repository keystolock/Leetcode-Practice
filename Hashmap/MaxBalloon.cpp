#include<string>
#include<algorithm>
#include<unordered_map>
class Solution {
public:
    int maxNumberOfBalloons(string text) {
        unordered_map<char, int> freq;

        // Count only relevant characters
        for (char c : text) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                freq[c]++;
            }
        }

        // Adjust counts for 'l' and 'o'
        int b = freq['b'];
        int a = freq['a'];
        int l = freq['l'] / 2;
        int o = freq['o'] / 2;
        int n = freq['n'];

        // Minimum count determines result
        return min({b, a, l, o, n});
    }
};

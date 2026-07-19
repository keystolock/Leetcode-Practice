# Smallest Subsequence of Distinct Characters

## Problem Statement
Given a string `s`, return the lexicographically smallest subsequence of `s` that contains all the distinct characters of `s` exactly once.

## Example
### Input
s = "cbacdcbc"

### Output
"acdb"


## Constraints
- `1 <= s.length <= 10^4`
- `s` consists of lowercase English letters.


## Approach
1. Track the **last occurrence** of each character.
2. Use a **stack** to build the subsequence.
3. Skip characters already included.
4. Pop larger characters if they appear later again (greedy choice).
5. Append the current character and mark it visited.

---

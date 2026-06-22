# Problem: Maximum Number of Balloons

## Problem Statement
Given a string `text`, you need to determine how many instances of the word **"balloon"** can be formed using the characters from `text`.  
Each character in `text` can only be used once.

### Example
- Input: `"loonbalxballpoon"`
- Output: `2`

---

## Approach
1. Count the frequency of characters relevant to the word `"balloon"` → `b, a, l, o, n`.
2. Since `"l"` and `"o"` appear twice in `"balloon"`, divide their counts by 2.
3. The maximum number of `"balloon"` words that can be formed is the **minimum** of these counts.

---

## Complexity
- **Time Complexity:** \(O(n)\), where \(n\) is the length of `text` (single pass to count characters).
- **Space Complexity:** \(O(1)\), since only a fixed set of characters are tracked.

---



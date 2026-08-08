# Lexicographically Smallest Valid Sequence

## Problem
You are given two strings `word1` and `word2`.

A string `x` is called *almost equal* to `y` if you can change at most one character in `x` to make it identical to `y`.

A sequence of indices `seq` is called valid if:
- The indices are sorted in ascending order.
- Concatenating the characters at these indices in `word1` in the same order results in a string that is almost equal to `word2`.

Return an array of size `word2.length` representing the lexicographically smallest valid sequence of indices.  
If no such sequence of indices exists, return an empty array.

**Note:** The answer must represent the lexicographically smallest array, not the corresponding string formed by those indices.

---

## Examples

### Example 1
**Input:**  
`word1 = "vbcca", word2 = "abc"`  
**Output:**  
`[0,1,2]`  

Explanation:  
- Change `word1[0]` → `'a'`  
- `word1[1]` is `'b'`  
- `word1[2]` is `'c'`

---

### Example 2
**Input:**  
`word1 = "bacdc", word2 = "abc"`  
**Output:**  
`[1,2,4]`  

Explanation:  
- `word1[1]` is `'a'`  
- Change `word1[2]` → `'b'`  
- `word1[4]` is `'c'`

---

### Example 3
**Input:**  
`word1 = "aaaaaa", word2 = "aaabc"`  
**Output:**  
`[]`  

Explanation:  
No valid sequence exists.

---

### Example 4
**Input:**  
`word1 = "abc", word2 = "ab"`  
**Output:**  
`[0,1]`

---

## Constraints
- \(1 \leq \text{word2.length} < \text{word1.length} \leq 3 \times 10^5\)  
- `word1` and `word2` consist only of lowercase English letters.

# Longest Substring of One Repeating Character

## Problem Statement
You are given a 0-indexed string `s`.  
You are also given:
- a 0-indexed string `queryCharacters` of length `k`
- a 0-indexed array of integers `queryIndices` of length `k`

These describe `k` queries.  
For the `i`-th query:
- Update the character in `s` at index `queryIndices[i]` to `queryCharacters[i]`.

Return an array `lengths` of length `k` where `lengths[i]` is the length of the longest substring of `s` consisting of only one repeating character **after the i-th query is performed**.

---

## Examples

### Example 1
**Input:**  
`s = "babacc"`  
`queryCharacters = "bcb"`  
`queryIndices = [1,3,3]`

**Output:**  
`[3,3,4]`

**Explanation:**  
- After 1st query → `"bbbacc"`, longest = `"bbb"` → 3  
- After 2nd query → `"bbbccc"`, longest = `"bbb"` or `"ccc"` → 3  
- After 3rd query → `"bbbbcc"`, longest = `"bbbb"` → 4  

---

### Example 2
**Input:**  
`s = "abyzz"`  
`queryCharacters = "aa"`  
`queryIndices = [2,1]`

**Output:**  
`[2,3]`

**Explanation:**  
- After 1st query → `"abazz"`, longest = `"zz"` → 2  
- After 2nd query → `"aaazz"`, longest = `"aaa"` → 3  

---

## Constraints
- \(1 \leq s.length \leq 10^5\)  
- `s` consists of lowercase English letters  
- \(k = queryCharacters.length = queryIndices.length\)  
- \(1 \leq k \leq 10^5\)  
- `queryCharacters` consists of lowercase English letters  
- \(0 \leq queryIndices[i] < s.length\)  

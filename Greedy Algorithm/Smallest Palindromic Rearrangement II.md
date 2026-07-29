# Smallest Palindromic Rearrangement II

## Problem
You are given a palindromic string `s` and an integer `k`.

Return the **k-th lexicographically smallest palindromic permutation** of `s`.  
If there are fewer than `k` distinct palindromic permutations, return an empty string.

---

## Examples
**Example 1**
Input: s = "abba", k = 2
Output: "baab"


**Example 2**
Input: s = "aa", k = 2
Output: ""

**Example 3**
Input: s = "bacab", k = 1
Output: "abcba

---

## Constraints
- `1 <= s.length <= 10^4`
- `s` consists of lowercase English letters.
- `s` is guaranteed to be palindromic.
- `1 <= k <= 10^6`


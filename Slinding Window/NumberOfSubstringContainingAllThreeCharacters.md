# Number of Substrings Containing All Three Characters

## Problem Statement
Given a string `s` consisting only of the characters `'a'`, `'b'`, and `'c'`, return the number of substrings of `s` that contain **at least one occurrence of each character** (`'a'`, `'b'`, and `'c'`).

---

## Constraints
- `1 <= s.length <= 5 * 10^4`
- `s` consists only of `'a'`, `'b'`, and `'c'`.

---

## Topic
**Sliding Window / Two Pointers**

---

## Example 1
**Input:**
s = "abcabc"
**Output:**
10

**Explanation:**
The substrings that contain all three characters are:
- `"abc"` (positions 0–2)
- `"abca"` (0–3)
- `"abcab"` (0–4)
- `"abcabc"` (0–5)
- `"bca"` (1–3)
- `"bcab"` (1–4)
- `"bcabc"` (1–5)
- `"cab"` (2–4)
- `"cabc"` (2–5)
- `"abc"` (3–5)

Total = 10 substrings.

---

## Example 2
**Input:**
s = "aaacb"
**Output:**
3

**Explanation:**
Valid substrings are:
- `"aaacb"` (0–4)
- `"aacb"` (1–4)
- `"acb"` (2–4)

---

## Example 3
**Input:**
s = "abc"
**Output:**
1

**Explanation:**
Only the substring `"abc"` contains all three characters.

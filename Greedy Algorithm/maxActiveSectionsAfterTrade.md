

## Problem Statement
You are given a binary string `s` of length `n`, where:
- `'1'` represents an active section.
- `'0'` represents an inactive section.

You can perform **at most one trade** to maximize the number of active sections in `s`.  
In a trade:
1. Convert a contiguous block of `'1'`s that is **surrounded by `'0'`s** into all `'0'`s.
2. Then convert a contiguous block of `'0'`s that is **surrounded by `'1'`s** into all `'1'`s.

Return the maximum number of active sections in `s` after making the optimal trade.

**Note:** Treat `s` as if it is augmented with a `'1'` at both ends, forming `t = '1' + s + '1'`.  
The augmented `'1'`s do not contribute to the final count.

---

## Examples

### Example 1
**Input:**  
`s = "01"`

**Output:**  
`1`

**Explanation:**  
No valid trade is possible. Maximum active sections = 1.

---

### Example 2
**Input:**  
`s = "0100"`

**Output:**  
`4`

**Explanation:**  
Augmented string: `"101001"`  
Choose `"0100"` → `"100001"` → `"111111"`  
Final string without augmentation = `"1111"` → 4 active sections.

---

### Example 3
**Input:**  
`s = "1000100"`

**Output:**  
`7`

**Explanation:**  
Augmented string: `"110001001"`  
Choose `"000100"` → `"110000001"` → `"111111111"`  
Final string without augmentation = `"1111111"` → 7 active sections.

---

### Example 4
**Input:**  
`s = "01010"`

**Output:**  
`4`

**Explanation:**  
Augmented string: `"1010101"`  
Choose `"010"` → `"1000101"` → `"1111101"`  
Final string without augmentation = `"11110"` → 4 active sections.

---

## Constraints
- \(1 \leq n = s.length \leq 10^5\)  
- `s[i]` is either `'0'` or `'1'`

---



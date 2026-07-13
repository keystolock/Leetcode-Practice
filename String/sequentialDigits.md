# Sequential Digits

## Problem Statement
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.  
For example, `1234` and `4567` are sequential digits, while `1245` and `1357` are not.

Given two integers `low` and `high`, return a list of all the integers that have sequential digits and lie in the inclusive range `[low, high]`.  
The answer should be sorted in increasing order.

---

## Example 1
**Input:**  
low = 100, high = 300  

**Output:**  
[123, 234]

---

## Example 2
**Input:**  
low = 1000, high = 13000  

**Output:**  
[1234, 2345, 3456, 4567, 5678, 6789, 12345]

---

## Constraints
- 10 ≤ low ≤ high ≤ 10^9

---

## Complexity Analysis
- **Time Complexity:**  
   `O(1)` (constant time)

---
- **Space Complexity:**   
  - **Overall:** `O(1)` (constant space)
  ---

# Plus One

## Problem Statement
You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the `i-th` digit of the integer.  
The digits are ordered from most significant to least significant in left-to-right order.  
The large integer does not contain any leading zero.  

Increment the large integer by one and return the resulting array of digits.

---

## Example 1
**Input:**  
digits = [1,2,3]

**Output:**  
[1,2,4]


**Explanation:**  
The integer 123 + 1 = 124.

---

## Example 2
**Input:**  
digits = [9]

**Output:**  
[1,0]

**Explanation:**  
The integer 9 + 1 = 10.

---

## Constraints
- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` does not contain leading zeros.

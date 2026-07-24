# Number of Unique XOR Triplets II

## Problem Statement
You are given an integer array `nums`.

A **XOR triplet** is defined as the XOR of three elements:
nums[i] ^ nums[j] ^ nums[k]   where i <= j <= k

Return the number of **unique XOR triplet values** from all possible triplets `(i, j, k)`.

---

## Examples

### Example 1
**Input:**
nums = [1, 3]

**Output:**
2

**Explanation:**
- Triplets produce values {1, 3}  
- Unique count = 2  

---

### Example 2
**Input:**
nums = [6, 7, 8, 9]

**Output:**
4

**Explanation:**
- Triplets produce values {6, 7, 8, 9}  
- Unique count = 4  

## Constraints
- 1 <= nums.length <= 1500  
- 1 <= nums[i] <= 1500  


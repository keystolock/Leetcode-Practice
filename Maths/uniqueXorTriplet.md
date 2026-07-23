# Number of Unique XOR Triplets I

## Problem Statement
You are given an integer array `nums` of length `n`, where `nums` is a permutation of the numbers in the range `[1, n]`.

A **XOR triplet** is defined as the XOR of three elements:
nums[i] ^ nums[j] ^ nums[k]   where i <= j <= k


Return the number of **unique XOR triplet values** from all possible triplets `(i, j, k)`.

---

## Constraints
- 1 <= n == nums.length <= 10^5  
- 1 <= nums[i] <= n  
- `nums` is a permutation of integers from 1 to n  

---

## Examples

### Example 1
**Input:**
nums = [1, 2]

**Output:**
2

**Explanation:**
- Triplets produce values {1, 2}  
- Unique count = 2  

---

### Example 2
**Input:**
nums = [3, 1, 2]


**Output:**
4

**Explanation:**
- Triplets produce values {0, 1, 2, 3}  
- Unique count = 4  



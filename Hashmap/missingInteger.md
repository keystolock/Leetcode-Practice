# Smallest Missing Integer Greater Than Sequential Prefix Sum

## Problem Statement
You are given a 0-indexed array of integers `nums`.

A prefix `nums[0..i]` is sequential if, for all `1 <= j <= i`,  
`nums[j] = nums[j - 1] + 1`.  
In particular, the prefix consisting only of `nums[0]` is sequential.

Return the smallest integer `x` missing from `nums` such that  
`x >= sum(longest sequential prefix)`.

---

## Example 1
**Input:**  
`nums = [1,2,3,2,5]`  

**Output:**  
`6`  

**Explanation:**  
The longest sequential prefix is `[1,2,3]` with sum = 6.  
6 is not in the array, so the answer is 6.

---

## Example 2
**Input:**  
`nums = [3,4,5,1,12,14,13]`  

**Output:**  
`15`  

**Explanation:**  
The longest sequential prefix is `[3,4,5]` with sum = 12.  
12, 13, and 14 are present, but 15 is missing.  
Therefore, the answer is 15.

---

## Constraints
- `1 <= nums.length <= 50`  
- `1 <= nums[i] <= 50`


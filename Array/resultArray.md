# Distribute Elements Into Two Arrays I

## Problem Statement
You are given a 1-indexed array of distinct integers `nums` of length `n`.

You need to distribute all the elements of `nums` between two arrays `arr1` and `arr2` using `n` operations:
1. Append `nums[1]` to `arr1`.
2. Append `nums[2]` to `arr2`.
3. For each `i ≥ 3`:
   - If the last element of `arr1` is greater than the last element of `arr2`, append `nums[i]` to `arr1`.
   - Otherwise, append `nums[i]` to `arr2`.

Finally, the result array is formed by concatenating `arr1` followed by `arr2`.

---

## Example 1
**Input:**  
`nums = [2,1,3]`  

**Output:**  
`[2,3,1]`  

**Explanation:**  
- Step 1: arr1 = [2]  
- Step 2: arr2 = [1]  
- Step 3: 2 > 1 → arr1 = [2,3]  
Result = [2,3,1]

---

## Example 2
**Input:**  
`nums = [5,4,3,8]`  

**Output:**  
`[5,3,4,8]`  

**Explanation:**  
- Step 1: arr1 = [5]  
- Step 2: arr2 = [4]  
- Step 3: 5 > 4 → arr1 = [5,3]  
- Step 4: 4 > 3 → arr2 = [4,8]  
Result = [5,3,4,8]

---

## Constraints
- \(3 \leq n \leq 50\)  
- \(1 \leq nums[i] \leq 100\)  
- All elements are distinct.


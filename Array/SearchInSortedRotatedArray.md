# Search in Rotated Sorted Array

## Introduction

This repository contains an implementation of the classic Search in Rotated Sorted Array problem.  

The challenge is to efficiently locate a target value in an array that was originally sorted in ascending order but then rotated at an unknown pivot.  

 

## Problem Statement
Given an integer array `nums` sorted in ascending order and rotated at some pivot index, and an integer `target`, return the index of `target` if it exists. Otherwise, return `-1`.

- **Constraints:**
  - `1 <= nums.length <= 10^5`
  - `-10^9 <= nums[i] <= 10^9`
  - `-10^9 <= target <= 10^9`


## Example
nums = [4,5,6,7,0,1,2]
target = 0


### Explanation
The array `[4,5,6,7,0,1,2]` is a rotated version of `[0,1,2,4,5,6,7]`.  
The target `0` is found at index `4`.

---

## Approach
The key insight is that **at least one half of the array is always sorted**:
1. Compute `mid = start + (end - start) / 2`.
2. If `nums[mid] == target`, return `mid`.
3. If the left half is sorted (`nums[mid] >= nums[start]`):
   - Check if the target lies between `nums[start]` and `nums[mid]`.
   - If yes, move `end = mid - 1`; otherwise, move `start = mid + 1`.
4. Else, the right half is sorted:
   - Check if the target lies between `nums[mid]` and `nums[end]`.
   - If yes, move `start = mid + 1`; otherwise, move `end = mid - 1`.
5. Repeat until `start > end`.

---

## Complexity Analysis

- **Time Complexity:** `O(log n)`  
  Binary search halves the search space each iteration.
- **Space Complexity:** `O(1)`  
  No extra data structures are used.

---

## Edge Cases
- Empty array → return `-1`
- Single element array → check directly
- Target not present → return `-1`
- No rotation (already sorted) → behaves like normal binary search

---

## Key Takeaway
This solution demonstrates how to adapt binary search to handle rotated arrays.  
It’s a fundamental problem that strengthens your grasp of **divide-and-conquer algorithms** and **search space reasoning**.

---

## How to Run
1. Clone the repository.
2. Compile the Java file:
   ```bash
   javac SearchInRotatedSortedArray.java


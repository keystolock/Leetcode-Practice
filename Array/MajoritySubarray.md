# Majority Subarrays

## Problem
You are given an integer array `nums` and a target value `target`.  
Count the number of subarrays where the target is the **majority element** (appears more than half the time).

## Input
- An integer array `nums` of length `n`  
- An integer `target`

## Output
- An integer representing the number of subarrays where `target` is the majority element

## Explanation
- Convert each element of `nums` into:
  - `+1` if it equals `target`
  - `-1` otherwise
- For each subarray, calculate the sum of these values
- If the sum > 0, then `target` appears more than half the time in that subarray
- Count all such subarrays

## Complexity
- **Time:** O(n²) (checking all subarrays)  
- **Space:** O(n) (transformed array)

## Tags
- Array  
- Prefix Sum

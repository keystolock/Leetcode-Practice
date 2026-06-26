# Majority Subarrays

## Problem
You are given an integer array `nums` and a target value `target`.  
Count the number of subarrays where the target is the **majority element** (appears more than half the time).

## Input
- An integer array `nums` of length `n`  
- An integer `target`

## Output
- An integer representing the number of subarrays where `target` is the majority element

## Sample Input/Output

### Example 1
**Input:**  
nums = [2, 1, 2]  
target = 2  

**Output:**  
4  

**Explanation:**  
The valid subarrays are:  
- [2]  
- [2, 1]  
- [1, 2]  
- [2, 1, 2]  

### Example 2
**Input:**  
nums = [1, 1, 2, 1]  
target = 1  

**Output:**  
7  

**Explanation:**  
Subarrays where `1` is majority include:  
- [1] (three times)  
- [1, 1]  
- [1, 1, 2]  
- [2, 1]  
- [1, 1, 2, 1]  

## Complexity
- **Time:** O(n)  
- **Space:** O(n)



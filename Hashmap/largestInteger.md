# Largest Almost Missing Integer

## 📌 Problem Statement
You are given an integer array `nums` and an integer `k`.

- An integer `x` is **almost missing** from `nums` if `x` appears in **exactly one subarray** of size `k` within `nums`.
- Return the largest almost missing integer from `nums`.  
- If no such integer exists, return `-1`.

A subarray is a contiguous sequence of elements within an array.

---

## 🔹 Examples

**Example 1:**
Input: nums = [3,9,2,1,7], k = 3
Output: 7

**Example 2:**
Input: nums = [3,9,7,2,1,7], k = 4
Output: 3

**Example 3:**
Input: nums = [0,0], k = 1
Output: -1


---

## 🔹 Constraints
- \(1 \leq nums.length \leq 50\)  
- \(0 \leq nums[i] \leq 50\)  
- \(1 \leq k \leq nums.length\)


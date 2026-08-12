# Length of Longest Subarray With at Most K Frequency

## 📌 Problem Statement
You are given an integer array `nums` and an integer `k`.

- The frequency of an element `x` is the number of times it occurs in an array.
- An array is called **good** if the frequency of each element in this array is less than or equal to `k`.
- Return the length of the longest good subarray of `nums`.

A subarray is a contiguous non-empty sequence of elements within an array.

---

## 🔹 Examples

**Example 1:**
Input: nums = [1,2,3,1,2,3,1,2], k = 2
Output: 6
Explanation: The longest good subarray is [1,2,3,1,2,3].


**Example 2:**
Input: nums = [1,2,1,2,1,2,1,2], k = 1
Output: 2
Explanation: The longest good subarray is [1,2] or [2,1].


**Example 3:**
Input: nums = [5,5,5,5,5,5,5], k = 4
Output: 4
Explanation: The longest good subarray is [5,5,5,5].


---

## 🔹 Constraints
- \(1 \leq nums.length \leq 10^5\)  
- \(1 \leq nums[i] \leq 10^9\)  
- \(1 \leq k \leq nums.length\)

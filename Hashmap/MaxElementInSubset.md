# Maximum Length of Exponentiation Chain

## Problem
Given an integer array `nums`, determine the maximum possible length of a sequence that can be formed under these rules:
- Each element in the sequence must exist in `nums`.
- For any number `x`, the next element can be `x^2` if it also exists in `nums`.
- Each number must appear with sufficient frequency to support the chain.

## Input
- An integer array `nums` of length `n`.

## Output
- An integer representing the maximum length of such a sequence.

---

## Demo Examples

### Example 1
**Input:**  
nums = [2, 4, 16]  

**Output:**  
3  

**Explanation:**  
The chain is: 2 → 4 → 16  

---

### Example 2
**Input:**  
nums = [1, 1, 1, 1]  

**Output:**  
3  

**Explanation:**  
The chain uses `1` multiple times. The maximum valid length is adjusted based on frequency rules.

---

### Example 3
**Input:**  
nums = [3, 9, 81, 6561]  

**Output:**  
4  

**Explanation:**  
The chain is: 3 → 9 → 81 → 6561  

---

### Example 4
**Input:**  
nums = [5, 25, 625, 2]  

**Output:**  
3  

**Explanation:**  
The chain is: 5 → 25 → 625  

---

## Constraints
- \(1 \leq n \leq 10^5\)  
- \(1 \leq nums[i] \leq 10^9\)

---

## Complexity
- **Time:** O(n log n) (due to squaring progression checks)  
- **Space:** O(n) (HashMap storage)



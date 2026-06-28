# Maximum Element After Decrementing and Rearranging

## Problem Statement
You are given an array `A` of positive integers.  
You may perform the following operations:
1. Rearrange the elements in any order.
2. Decrement elements (reduce their value) any number of times, but not below 1.

Your task is to maximize the value of the last element in the array after performing these operations.

---

## Example
**Input:**  
A = [2, 2, 1, 2, 1]  

**Output:**  
2  

---

## Constraints
- \(1 \leq n \leq 10^5\)  
- \(1 \leq A[i] \leq 10^9\)

---

## Topic Classification
- **Greedy Algorithm**

---

## Explanation (Greedy Approach)

1. **Sort the array**  
[1, 1, 2, 2, 2]
2. **Force the first element to be 1**  
[1, 1, 2, 2, 2]
3. **Iterate through the array**  
- At each step, set the current element to the minimum of its value and `(previous element + 1)`.  
- This ensures the sequence grows as much as possible without skipping values.

Dry run:  
- i = 1 → min(1, 2) = 1  
- i = 2 → min(2, 2) = 2  
- i = 3 → min(2, 3) = 2  
- i = 4 → min(2, 3) = 2  

Final array:  
[1, 1, 2, 2, 2]


---



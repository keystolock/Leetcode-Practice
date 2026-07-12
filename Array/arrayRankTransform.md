# Array Rank Transform

## Problem Statement
Given an integer array `arr`, transform it into its rank array.

- The rank represents how large the element is compared to others.
- Rank starts from 1.
- Equal elements share the same rank.
- The rank should be as small as possible.

### Example 1
**Input:** arr = [40, 10, 20, 30]  
**Output:** [4, 1, 2, 3]

### Example 2
**Input:** arr = [100, 100, 100]  
**Output:** [1, 1, 1]

### Example 3
**Input:** arr = [37, 12, 28, 9, 100, 56, 80, 5, 12]  
**Output:** [5, 3, 4, 2, 9, 6, 8, 1, 3]

---

## Constraints
- \(0 \leq arr.length \leq 10^5\)  
- \(-10^9 \leq arr[i] \leq 10^9\)

---

## Approach
1. **Clone and sort** the array to determine order.
2. **Assign ranks** to unique elements using a hash map.
3. **Replace original values** with their corresponding ranks.

---

## Complexity Analysis
- **Time Complexity:** \(O(n \log n)\) due to sorting.  
- **Space Complexity:** \(O(n)\) for storing ranks in the hash map.

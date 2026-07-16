
## Problem Statement
You are given an integer array `nums` of length `n`.

Construct an array `prefixGcd` where for each index `i`:

- Let `mxi = max(nums[0], nums[1], ..., nums[i])`.
- `prefixGcd[i] = gcd(nums[i], mxi)`.

After constructing `prefixGcd`:

1. Sort `prefixGcd` in non-decreasing order.  
2. Form pairs by taking the smallest unpaired element and the largest unpaired element.  
3. Repeat this process until no more pairs can be formed.  
4. For each formed pair, compute the gcd of the two elements.  
5. If `n` is odd, the middle element in the `prefixGcd` array remains unpaired and should be ignored.  

Return an integer denoting the sum of the GCD values of all formed pairs.

The term `gcd(a, b)` denotes the greatest common divisor of `a` and `b`.

---

## Example 1
**Input:**
nums = [2, 6, 4]


**Output:**
2

**Explanation:**

i   nums[i]   mxi   prefixGcd[i]
0   2         2     2
1   6         6     6
2   4         6     2
prefixGcd = [2, 6, 2] → sorted → [2, 2, 6]
Pair gcd(2, 6) = 2
Middle element 2 ignored
Answer = 2



---

## Constraints
- \(1 \leq n = nums.length \leq 10^5\)  
- \(1 \leq nums[i] \leq 10^9\)

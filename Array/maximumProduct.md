# Maximum Product of Two Elements in an Array

## Problem Statement
Given an integer array `nums`, find the maximum value of `(nums[i] - 1) * (nums[j] - 1)` where `i` and `j` are distinct indices.

## Topic
Array Traversal / Greedy

## Explanation
- The task is to select the two largest elements in the array.
- Subtract 1 from each of them.
- Multiply the results to get the maximum product.

## Example
### Input
nums = [3, 4, 5, 2]

### Output
12

### Reasoning
- Largest two numbers are 5 and 4.
- Calculation: `(5 - 1) * (4 - 1) = 4 * 3 = 12`.

## Constraints
- `2 <= nums.length <= 10^4`
- `1 <= nums[i] <= 10^3`

## Approach
- Traverse the array once to find the two largest elements.
- Compute the product after subtracting 1 from each.
- Time Complexity: **O(n)**
- Space Complexity: **O(1)**

# Path Existence Queries using Binary Lifting

## Problem Statement
You are given an array `nums` of length `n` and a parameter `maxDiff`.  
Two indices `u` and `v` are considered connected if you can move from `u` to `v` through a sequence of jumps, where each jump moves to another index whose value differs by at most `maxDiff`.

You need to answer multiple queries.  
Each query provides two indices `(u, v)` and asks for the **minimum number of jumps** required to reach `v` from `u`.  
If it is not possible, return `-1`.

---

## Input Format
- An integer `n` representing the size of the array.
- An array `nums` of length `n`.
- An integer `maxDiff`.
- A list of queries, where each query is a pair `[u, v]`.

---

## Output Format
- For each query, output the minimum number of jumps required to reach `v` from `u`.
- If unreachable, output `-1`.

---

## Constraints
- \(1 \leq n \leq 10^5\)  
- \(1 \leq nums[i] \leq 10^9\)  
- \(1 \leq maxDiff \leq 10^9\)  
- Number of queries up to \(10^5\)

---

## Sample Input
n = 5
nums = [1, 5, 3, 10, 7]
maxDiff = 4
queries = [[0, 4], [1, 3], [2, 4]]

## Sample Output
[2,-1,1]

---

## Explanation
- Query `[0, 4]`: From index `0 (value=1)` → jump to index `2 (value=3)` → jump to index `4 (value=7)`. Total jumps = 2.  
- Query `[1, 3]`: From index `1 (value=5)` cannot reach index `3 (value=10)` within allowed difference. Output = -1.  
- Query `[2, 4]`: From index `2 (value=3)` → directly jump to index `4 (value=7)`. Total jumps = 1.

---

## Time Complexity
𝑂(𝑛log𝑛 + 𝑞log𝑛)

## Space Complexity
𝑂(𝑛log𝑛)

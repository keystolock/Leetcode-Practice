# Maximize Active Section with Trade II

## Problem Statement
You are given a binary string `s` of length `n`, where:
- `'1'` represents an active section.
- `'0'` represents an inactive section.

You can perform **at most one trade** to maximize the number of active sections in `s`.  
In a trade:
1. Convert a contiguous block of `'1'`s that is surrounded by `'0'`s to all `'0'`s.
2. Afterwards, convert a contiguous block of `'0'`s that is surrounded by `'1'`s to all `'1'`s.

Additionally, you are given a 2D array `queries`, where `queries[i] = [li, ri]` represents a substring `s[li...ri]`.

For each query, determine the maximum possible number of active sections in `s` after making the optimal trade on the substring `s[li...ri]`.

Return an array `answer`, where `answer[i]` is the result for `queries[i]`.

**Note:**
- For each query, treat `s[li...ri]` as if it is augmented with a `'1'` at both ends, forming `t = '1' + s[li...ri] + '1'`.  
- The augmented `'1'`s do not contribute to the final count.
- The queries are independent of each other.

---

## Sample Input
```text
s = "0100"
queries = [[0,3],[0,2],[1,3],[2,3]]

## Output
[4,3,1,1]

## Explanation
Query [0, 3] → Substring "0100" → Augmented "101001" → Optimal trade yields "1111" → Answer = 4

Query [0, 2] → Substring "010" → Augmented "10101" → Optimal trade yields "1110" → Answer = 3

Query [1, 3] → Substring "100" → Augmented "11001" → No valid trade → Answer = 1

Query [2, 3] → Substring "00" → Augmented "1001" → No valid trade → Answer = 1

## Constraints
- \(1 \leq n = s.length \leq 10^5\)  
- \(1 \leq queries.length \leq 10^5\)  
- \(s[i]\) is either `'0'` or `'1'`  
- \(0 \leq li \leq ri < n\)
# Problem: Sum and Multiply Substrings


## Description
You are given a numeric string `s` and a list of queries.  
Each query is defined by two integers `[l, r]`, representing a substring of `s` from index `l` to `r` (inclusive).

For each query:
1. Extract the numeric value of the substring (considering non-zero digits only).
2. Compute the sum of digits in the substring.
3. Multiply the numeric value by the digit sum.
4. Return the result modulo `10^9 + 7`.

## Input
- A string `s` consisting of digits (`0-9`).
- An array of queries, where each query is `[l, r]`.

## Output
- An array of integers, where each element is the result for the corresponding query.

## Constraints
- `1 <= s.length <= 10^5`
- `1 <= queries.length <= 10^5`
- `0 <= l <= r < s.length`
- Modulo: `10^9 + 7`

## Sample Input
s = "12034"
queries = [[0, 2], [1, 4]]

## Sample Output
[6, 54]

## Explanation
- Query [0, 2]: Substring = "120" → Non-zero digits = "12" → Value = 12, Sum = 1+2+0 = 3 → Result = 12 * 3 = 36 → 36 % (1e9+7) = 36
- Query [1, 4]: Substring = "2034" → Non-zero digits = "234" → Value = 234, Sum = 2+0+3+4 = 9 → Result = 234 * 9 = 2106 → 2106 % (1e9+7) = 2106

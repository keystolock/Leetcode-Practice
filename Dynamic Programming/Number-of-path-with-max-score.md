# Paths With Maximum Score

## Problem Statement
You are given a square board of characters. Each cell contains:
- A digit ('1'–'9') representing points you can collect.
- 'S' representing the starting point (top-left corner).
- 'E' representing the ending point (bottom-right corner).
- 'X' representing an obstacle (impassable cell).
- '0' representing an empty cell with no points.

You start at 'S' and want to reach 'E'. At each step, you may move:
- Down
- Right
- Diagonally down-right

Your goal is to:
1. Find the maximum score you can collect along any valid path from 'S' to 'E'.
2. Count the number of distinct paths that yield this maximum score.

Return the result as:
- `[max_score, num_paths]`
- Both values should be taken modulo `10^9 + 7`.

If there is no valid path, return `[0, 0]`.

---

## Constraints
- The board size is `n x n` where `1 <= n <= 100`.
- Each cell contains one of: `'E'`, `'S'`, `'X'`, `'0'–'9'`.

---

## Sample Input
```text
["E23",
 "2X2",
 "12S"]
[7, 1]

## Sample Output
[7, 1]

# Explanation

The maximum score path is E → 2 → 2 → S with a total score of 7.

There is exactly 1 path that achieves this maximum score

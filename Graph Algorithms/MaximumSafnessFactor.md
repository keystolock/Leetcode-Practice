
## Problem Statement
You are given an `n x n` grid where:
- `grid[i][j] = 1` represents a thief at cell `(i, j)`.
- `grid[i][j] = 0` represents an empty cell.

The **safeness factor** of a path is defined as the minimum distance from any cell in the path to the nearest thief.  
Your task is to find the **maximum safeness factor** among all possible paths from the top-left `(0,0)` to the bottom-right `(n-1,n-1)`.

---

## Constraints
- `1 <= n <= 400`
- `grid[i][j]` is either `0` or `1`.

---

## Sample Input
grid = [
[0,0,1],
[0,0,0],
[0,0,0]
]
## Sample Output
2

---

## Explanation
- The thieves are located at `(0,2)`.  
- Distances from each cell to the nearest thief are calculated.  
- The path chosen maximizes the minimum safeness factor along the way.  
- The best path achieves a safeness factor of `2`.

---

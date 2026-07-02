# Find Safe Walk

## Problem Statement
You are given a grid consisting of `0`s and `1`s, where:
- `0` represents a safe cell.
- `1` represents a dangerous cell that reduces your health by 1 when entered.

You start at the top-left cell `(0,0)` with an initial health value.  
Your goal is to determine whether you can safely reach the bottom-right cell `(row-1, col-1)` while keeping your health strictly greater than `0` at every step.

You may move **up, down, left, or right** to adjacent cells.

Return `true` if it is possible to reach the destination, otherwise return `false`.

---

## Topic
**Graph Algorithms (0-1 BFS)**

---

## Sample Input
grid = [
[0, 1, 0],
[0, 0, 1],
[1, 0, 0]
]
health = 3
## Sample Output
true 

### Explanation
- Start at `(0,0)` with health = 3.
- Move right to `(0,1)` → dangerous cell, health = 2.
- Move down to `(1,1)` → safe cell, health = 2.
- Move down to `(2,1)` → safe cell, health = 2.
- Move right to `(2,2)` → destination reached with health = 2 > 0.

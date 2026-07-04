# Minimum Score of a Path Between Two Cities



## Problem Statement
You are given `n` cities numbered from `1` to `n` and an array `roads` where each `roads[i] = [ai, bi, distancei]` represents a bidirectional road between cities `ai` and `bi` with a distance `distancei`.

The **score of a path** between two cities is defined as the minimum distance among all the edges in that path.

Return the **minimum score of a path** between city `1` and city `n`.

It is guaranteed that there is at least one path between city `1` and city `n`.

---

## Example 1
**Input:**
n = 4
roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]

**Output:**
5

**Explanation:**
One possible path is `1 → 2 → 4`.  
The edge weights are `[9, 5]`.  
The minimum among them is `5`.

---

## Example 2
**Input:**
n = 3
roads = [[1,2,2],[2,3,4],[1,3,3]]

**Output:**
 2
 
**Explanation:**
Path `1 → 2 → 3` has edge weights `[2, 4]`.  
The minimum is `2`.

---

## Constraints
- \(2 \leq n \leq 10^5\)  
- \(1 \leq roads.length \leq 10^5\)  
- \(roads[i].length = 3\)  
- \(1 \leq ai, bi \leq n\)  
- \(ai \neq bi\)  
- \(1 \leq distancei \leq 10^4\)  
- There are no repeated edges.  
- There is at least one path between city `1` and city `n`.

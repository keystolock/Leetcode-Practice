

## Problem Statement
You are given a directed acyclic graph (DAG) with `n` nodes and weighted edges.  
Some nodes are marked as **online**. You start from node `0` and want to reach node `n-1`.  

- You can only traverse edges with weight **≥ limit**.  
- You can only pass through intermediate nodes that are online (except the destination).  
- The total path cost must not exceed `k`.  

Find the **maximum possible limit** such that a valid path exists.

---

## Input Format
- `edges`: List of edges, where each edge is represented as `[u, v, cost]`.  
- `online`: Boolean array of length `n`, indicating which nodes are online.  
- `k`: Maximum allowed path cost.

---

## Output Format
- Return the maximum limit value.  
- If no valid path exists, return `-1`.

---

## Sample Input
edges = [
[0, 1, 5],
[1, 2, 7],
[0, 2, 10]
]
online = [true, true, true]
k = 15

## Sample Output
7

---

## Explanation
- Path `0 → 1 → 2` has costs `[5, 7]` → total = 12.  
- Path `0 → 2` has cost `10`.  
- The maximum limit that still allows a valid path with total cost ≤ 15 is **7**.


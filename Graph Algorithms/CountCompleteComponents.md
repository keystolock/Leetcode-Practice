# Count Complete Components

## Problem Statement
You are given an integer `n` representing the number of nodes in an undirected graph, labeled from `0` to `n - 1`.  
You are also given a 2D array `edges` where each `edges[i] = [ai, bi]` indicates that there is an undirected edge between nodes `ai` and `bi`.

A **connected component** of the graph is called **complete** if every pair of distinct vertices in the component is connected by an edge.

Return the number of complete connected components in the graph.

---

## Example 1
**Input:**
# Count Complete Components

## Problem Statement
You are given an integer `n` representing the number of nodes in an undirected graph, labeled from `0` to `n - 1`.  
You are also given a 2D array `edges` where each `edges[i] = [ai, bi]` indicates that there is an undirected edge between nodes `ai` and `bi`.

A **connected component** of the graph is called **complete** if every pair of distinct vertices in the component is connected by an edge.

Return the number of complete connected components in the graph.

---

## Example 1
**Input:**
n = 6
edges = [[0,1],[0,2],[1,2],[3,4]]

**Output:**
2

**Explanation:**
- Component 1: Nodes {0,1,2} form a complete graph (triangle).
- Component 2: Nodes {3,4} form a complete graph (single edge).
- Node {5} is isolated, which is also considered a complete component.

---

## Example 2
**Input:**
n = 4
edges = [[0,1],[1,2]]

**Output:**
2

**Explanation:**
- Component 1: Nodes {0,1,2} are connected but not complete (missing edge between 0 and 2).
- Component 2: Node {3} is isolated, which is complete.

---

## Constraints
- \(1 \leq n \leq 50\)
- \(0 \leq edges.length \leq n \cdot (n - 1) / 2\)
- `edges[i].length == 2`
- `0 <= ai, bi < n`
- `ai != bi`
- No duplicate edges.

---



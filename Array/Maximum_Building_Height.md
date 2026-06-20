# 🏙️ Maximum Building Height (LeetCode #1840)

## 📌 Problem Summary
You are given an integer `n` representing the number of buildings in a line, numbered from `1` to `n`.  
Each building can have any height, but there are restrictions:  
- Restrictions are given as pairs `[id, maxHeight]`, meaning building `id` cannot exceed `maxHeight`.  
- Building `1` must have height `0`.  
- The height difference between adjacent buildings cannot exceed `1`.

Return the **maximum possible height of any building**.

---

## 🔹 Example
**Input:**  
n = 5
restrictions = [[2,1],[4,1]]

**Output:**  
2

---

## ⚙️ Constraints
- `2 <= n <= 10^9`  
- `0 <= restrictions.length <= 10^5`  
- `restrictions[i].length == 2`  
- `2 <= restrictions[i][0] <= n-1`  
- `0 <= restrictions[i][1] <= 10^9`  
- Restrictions are unique and sorted by building index.

---

## 💡 Approach
1. **Sort restrictions** by building index.  
2. Add two artificial restrictions:  
   - Building `1` with height `0`.  
   - Building `n` with height `n-1` (maximum possible slope).  
3. **Forward pass**: Ensure each restriction respects slope limits from left to right.  
4. **Backward pass**: Ensure slope limits from right to left.  
5. Compute the maximum possible height between consecutive restrictions using slope constraints.  

---

## ⏱️ Complexity Analysis
- **Time Complexity:** \(O(m \log m)\) due to sorting, where `m` is the number of restrictions.  
- **Space Complexity:** \(O(m)\) for storing restrictions.  

---

## ✅ Key Insights
- The slope constraint (difference ≤ 1) is the core of the problem.  
  

---

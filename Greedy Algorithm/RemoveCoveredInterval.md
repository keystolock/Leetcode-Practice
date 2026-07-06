# Remove Covered Intervals

## 📝 Problem Summary
You are given a list of intervals. An interval `[a, b]` is **covered** by another interval `[c, d]` if `c <= a` and `b <= d`.  
The task is to remove all covered intervals and return the number of remaining intervals.

---

## 📊 Example
**Input:**  
intervals = [[1,4],[3,6],[2,8]]

**Output:**  
2

**Explanation:**  
- `[3,6]` is covered by `[2,8]`.  
- `[1,4]` is covered by `[2,8]`.  
- Remaining intervals: `[2,8]` and `[3,6]` → count = 2.

---

## 🎯 Key Idea
1. **Sort intervals**:
   - By start ascending.
   - If starts are equal, sort by end descending.
2. **Greedy check**:
   - Track the maximum end seen so far.
   - If current interval’s end > maxEnd → it’s not covered → count++.
   - Otherwise, it’s covered → skip.

---


## ⏱️ Complexity
- **Time:** `O(n log n)` (sorting dominates)  
- **Space:** `O(1)` (only counters and maxEnd used)

---

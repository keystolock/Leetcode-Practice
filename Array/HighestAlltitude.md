# 🚴‍♂️ Find the Highest Altitude (LeetCode #1732)

## 📌 Problem Summary
You are given an integer array `gain` of length `n` where `gain[i]` represents the net gain in altitude between points `i` and `i+1`.  
The biker starts at altitude `0`. Return the **highest altitude** reached.

---

## 🔹 Example
**Input:**  
gain = [-5, 1, 5, 0, -7]

**Process:**  
- Start altitude = 0  
- After -5 → -5  
- After +1 → -4  
- After +5 → 1  
- After +0 → 1  
- After -7 → -6  

**Output:**  
1

---

## ⚙️ Constraints
- `n == gain.length`  
- `1 <= n <= 100`  
- `-100 <= gain[i] <= 100`

---
## ⏱️ Complexity Analysis
- **Time Complexity:** \(O(n)\) — single pass through the array.  
- **Space Complexity:** \(O(1)\) — only a few variables used.

---





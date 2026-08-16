# Stone Game IX

## Problem
Alice and Bob continue their games with stones.  
There is a row of `n` stones, each with a value given in the array `stones`.  

Rules:
- Alice and Bob take turns, with Alice starting first.  
- On each turn, a player may remove any stone.  
- The player **loses** if the sum of removed stones is divisible by 3.  
- Bob wins automatically if there are no remaining stones (even if it is Alice’s turn).  

Return **true** if Alice wins, otherwise **false**.

---

## Examples

### Example 1
**Input:**  
`stones = [2,1]`  

**Output:**  
`true`  

**Explanation:**  
Alice removes one stone, Bob removes the other.  
Sum = 3 → divisible by 3 → Bob loses, Alice wins.

---

### Example 2
**Input:**  
`stones = [2]`  

**Output:**  
`false`  

**Explanation:**  
Alice removes the only stone.  
Sum = 2 → not divisible by 3.  
No stones remain → Bob wins automatically.

---

### Example 3
**Input:**  
`stones = [5,1,2,4,3]`  

**Output:**  
`false`  

**Explanation:**  
No matter how Alice plays, Bob can force a win.  
Final sum = 15 → divisible by 3 → Alice loses.

---

## Constraints
- \(1 \leq \text{stones.length} \leq 10^5\)  
- \(1 \leq \text{stones}[i] \leq 10^4\)  

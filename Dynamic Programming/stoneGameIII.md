# Stone Game III

## Problem
Alice and Bob play a game with piles of stones. Each stone has a value given in the array `stoneValue`.  
- Alice starts first.  
- On each turn, a player can take 1, 2, or 3 stones from the first remaining stones.  
- The score of each player is the sum of the values of the stones taken.  
- The objective is to maximize the final score.  
- Both players play optimally.  

Return:
- `"Alice"` if Alice wins,  
- `"Bob"` if Bob wins,  
- `"Tie"` if scores are equal.  

---

## Examples
- Input: `[1,2,3,7]` → Output: `"Bob"`  
- Input: `[1,2,3,-9]` → Output: `"Alice"`  
- Input: `[1,2,3,6]` → Output: `"Tie"`  

---

## Constraints
- \(1 \leq \text{stoneValue.length} \leq 5 \times 10^4\)  
- \(-1000 \leq \text{stoneValue}[i] \leq 1000\)  

# Stone Game II

## Problem
Alice and Bob continue their game with piles of stones.  
- Piles are arranged in a row, each with a positive integer number of stones.  
- Alice starts first.  
- On each turn, a player can take all stones in the first **X** remaining piles, where `1 <= X <= 2M`.  
- Then, `M = max(M, X)`. Initially, `M = 1`.  
- The game continues until all piles are taken.  

Return the **maximum number of stones Alice can get**, assuming both play optimally.

---

## Example 1
**Input:** `piles = [2,7,9,4,4]`  
**Output:** `10`  

Explanation:  
- If Alice takes 1 pile → Bob takes 2 piles → Alice takes 2 piles → Alice gets `2 + 4 + 4 = 10`.  
- If Alice takes 2 piles → Bob takes all 3 → Alice gets `2 + 7 = 9`.  
- So the maximum is `10`.

---

## Example 2
**Input:** `piles = [1,2,3,4,5,100]`  
**Output:** `104`

---

## Constraints
- `1 <= piles.length <= 100`  
- `1 <= piles[i] <= 10^4`


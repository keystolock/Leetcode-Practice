# Stone Game

## Problem Statement
Alice and Bob play a game with piles of stones.  
- There are an even number of piles arranged in a row.  
- Each pile has a positive integer number of stones.  
- The total number of stones is odd, so there are no ties.  

Players take turns:
- Alice starts first.  
- On each turn, a player takes the entire pile of stones either from the beginning or the end of the row.  
- The game continues until no piles remain.  
- The player with the most stones wins.  

Return **true** if Alice wins the game assuming both play optimally, otherwise return **false**.

---

## Example 1
**Input:**  
`piles = [5,3,4,5]`  

**Output:**  
`true`  

**Explanation:**  
Alice can take the first 5. Bob then chooses optimally, but Alice still wins.

---

## Example 2
**Input:**  
`piles = [3,7,2,3]`  

**Output:**  
`true`  

---

## Constraints
- `2 <= piles.length <= 500`  
- `piles.length` is even  
- `1 <= piles[i] <= 500`  
- `sum(piles[i])` is odd  


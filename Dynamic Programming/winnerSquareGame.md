# Stone Game IV

## Problem Statement
Alice and Bob take turns playing a game, with Alice starting first.  
- Initially, there are `n` stones in a pile.  
- On each turn, a player removes any non-zero **square number** of stones.  
- If a player cannot make a move, they lose the game.  

Return **true** if Alice wins the game assuming both play optimally, otherwise return **false**.

---

## Example 1
**Input:**  
`n = 1`  

**Output:**  
`true`  

**Explanation:**  
Alice removes 1 stone and wins immediately.

---

## Example 2
**Input:**  
`n = 2`  

**Output:**  
`false`  

**Explanation:**  
Alice removes 1 stone, Bob removes the last one, Alice loses.

---

## Example 3
**Input:**  
`n = 4`  

**Output:**  
`true`  

**Explanation:**  
Alice removes all 4 stones in one move.

---

## Constraints
- `1 <= n <= 10^5`


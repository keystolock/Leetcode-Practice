# Stone Game V

## Problem
There are several stones arranged in a row, each with an integer value given in `stoneValue`.

- Alice divides the row into two non-empty parts (left and right).  
- Bob compares the sums of both parts and discards the one with the larger sum.  
- Alice’s score increases by the sum of the remaining part.  
- If both parts are equal, Alice chooses which part to discard.  
- The game continues with the remaining row until only one stone is left.  

Return the **maximum score Alice can obtain**.

---

## Example 1
**Input:** `stoneValue = [6,2,3,4,5,5]`  
**Output:** `18`  

Explanation:  
- Alice splits `[6,2,3]` and `[4,5,5]`.  
- Bob discards the right row (sum = 14), Alice gains 11.  
- Next split → Alice gains 5 more.  
- Final split → Alice gains 2.  
- Total = 18.

---

## Example 2
**Input:** `stoneValue = [7,7,7,7,7,7,7]`  
**Output:** `28`

---

## Example 3
**Input:** `stoneValue = [4]`  
**Output:** `0`

---

## Constraints
- `1 <= stoneValue.length <= 500`  
- `1 <= stoneValue[i] <= 10^6`

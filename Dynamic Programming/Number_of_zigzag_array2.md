# ZigZag Arrays Problem

## Problem Statement
You are given integers `n`, `l`, and `r`.  
Count the number of zigzag arrays of length `n` where each element lies in the range `[l, r]`.  
A zigzag array alternates between increasing and decreasing values.  
Return the answer modulo **10^9 + 7**.

---

## Approach

1. **Matrix Representation**  
   - Construct a transition matrix `M` of size `2k × 2k` where `k = r - l + 1`.  
   - The first half of states represent increasing transitions, the second half represent decreasing transitions.  
   - Entries are set to `1` where transitions are allowed (zigzag condition).

2. **Matrix Exponentiation**  
   - Raise `M` to the power `n-1` using fast exponentiation.  
   - This computes the number of valid zigzag arrays of length `n`.

3. **Summation**  
   - Sum all entries of the resulting matrix to get the final answer.

---

## Topics
- Dynamic Programming  
- Matrix Exponentiation  
- Combinatorics

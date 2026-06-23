# ZigZag Arrays Problem

## Problem Statement
Count the number of zig-zag arrays of length `n` where each element lies in the range `[l, r]`.  
A zig-zag array alternates between increasing and decreasing values.

- Input: integers `n`, `l`, `r`
- Output: number of valid zig-zag arrays modulo `1_000_000_007`

---

## Approach

### Key Ideas
1. **Dynamic Programming (DP):**
   - Maintain two states:
     - `up[x]`: number of zig-zag arrays ending at value `x` with last step going up.
     - `down[x]`: number of zig-zag arrays ending at value `x` with last step going down.
   
2. **Initialization (length = 2):**
   - For each value `v`:
     - `up[v] = v - 1` (choices smaller than `v`)
     - `down[v] = m - v` (choices larger than `v`)
   - Here, `m = r - l + 1`.

3. **Transition (length ≥ 3):**
   - Use prefix sums of `down` and suffix sums of `up` to compute new states efficiently:
     - `newUp[x] = sum(down[1..x-1])`
     - `newDown[x] = sum(up[x+1..m])`

4. **Final Answer:**
   - Sum over all `up[v] + down[v]`.

---

## Complexity
- Time: \(O(n \cdot m)\)  
- Space: \(O(m)\)

---


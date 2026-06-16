# 3612. Process String with Special Operations I on Leetcode

**Problem Statement:**

You are given a string `s` consisting of lowercase English letters and the special characters: `*`, `#`, and `%`.

Build a new string `result` by processing `s` according to the following rules from left to right:

1. If the character is a lowercase English letter, append it to `result`.
2. A `*` removes the last character from `result`, if it exists.
3. A `#` duplicates the current `result` and appends it to itself.
4. A `%` reverses the current `result`.

Return the final string `result` after processing all characters in `s`.

**Difficulty:** Medium  
**Topics:** String, Simulation  


## Example 1

**Input:** 
s = "abc*#"


**Process:**
- `a` → result = "a"  
- `b` → result = "ab"  
- `c` → result = "abc"  
- `*` → remove last → result = "ab"  
- `#` → duplicate → result = "abab"  

**Output:**
"abab"


---

## Example 2

**Input:**
s = "ab%#"

**Process:**
- `a` → result = "a"  
- `b` → result = "ab"  
- `%` → reverse → result = "ba"  
- `#` → duplicate → result = "baba"  

**Output:**
baba

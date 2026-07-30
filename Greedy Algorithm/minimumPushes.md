# Minimum Pushes to Type Word

## Problem Statement
You are given a string `word` containing distinct lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key `2` is mapped with `["a","b","c"]`.  
- To type `"a"`, you push the key once.  
- To type `"b"`, you push the key twice.  
- To type `"c"`, you push the key three times.  

It is allowed to **remap the keys numbered 2 to 9** to distinct collections of letters. Each letter must be mapped to exactly one key. You need to find the **minimum number of times the keys will be pushed** to type the string `word`.

Return the minimum number of pushes needed to type `word` after remapping the keys.

## Example 1
**Input:**  
`word = "abcde"`

**Output:**  
`5`

**Explanation:**  
- `"a"` → one push on key 2  
- `"b"` → one push on key 3  
- `"c"` → one push on key 4  
- `"d"` → one push on key 5  
- `"e"` → one push on key 6  
Total cost = 1 + 1 + 1 + 1 + 1 = **5**

---

## Example 2
**Input:**  
`word = "xycdefghij"`

**Output:**  
`12`

**Explanation:**  
- `"x"` → one push on key 2  
- `"y"` → two pushes on key 2  
- `"c"` → one push on key 3  
- `"d"` → two pushes on key 3  
- `"e"` → one push on key 4  
- `"f"` → one push on key 5  
- `"g"` → one push on key 6  
- `"h"` → one push on key 7  
- `"i"` → one push on key 8  
- `"j"` → one push on key 9  
Total cost = **12**

---

## Constraints
- \(1 \leq \text{word.length} \leq 26\)  
- `word` consists of lowercase English letters.  
- All letters in `word` are distinct.


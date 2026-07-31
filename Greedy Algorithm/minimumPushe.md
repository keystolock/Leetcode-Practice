# Minimum Number of Pushes to Type Word II

## 📖 Problem Statement
You are given a string `word` containing lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters. Each letter requires a certain number of pushes depending on its position on the key. Keys numbered 2 to 9 can be remapped to any distinct collections of letters, but each letter must be mapped to exactly one key.

Your task is to find the **minimum number of pushes** needed to type the string `word` after optimally remapping the keys.

---

## 🔍 Examples

### Example 1
**Input:**  
word = "abcde"

**Output:**  
5

### Example 2
**Input:**  
word = "xyzxyzxyzxyz"

**Output:**  
12

### Example 3
**Input:**  

word = "aabbccddeeffgghhiiiiii"

**Output:**  
24


---

## ⚙️ Constraints
- `1 <= word.length <= 10^5`  
- `word` consists of lowercase English letters.  


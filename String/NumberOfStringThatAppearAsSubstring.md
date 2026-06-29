# Problem: Number of Strings That Appear as Substrings in Word

## 📝 Problem Statement
You are given an array of strings `patterns` and a string `word`.  
Return the number of strings in `patterns` that exist as a substring in `word`.

A substring is a contiguous sequence of characters within a string.



---

## 📊 Example 1
**Input:**
patterns = ["a","abc","bc","d"]
word = "abc"
**Output:**
3

**Explanation:**
- `"a"` is a substring of `"abc"`
- `"abc"` is a substring of `"abc"`
- `"bc"` is a substring of `"abc"`
- `"d"` is not a substring of `"abc"`

So, the count is `3`.

---

## 📊 Example 2
**Input:**
patterns = ["a","b","c"]
word = "aaaaabbbbb"
**Output:**
2

**Explanation:**
- `"a"` is a substring of `"aaaaabbbbb"`
- `"b"` is a substring of `"aaaaabbbbb"`
- `"c"` is not a substring of `"aaaaabbbbb"`

So, the count is `2`.

---

## 📊 Example 3
**Input:**
patterns = ["xyz","xy","z"]
word = "xyzz"
**Output:**
3

**Explanation:**
- `"xyz"` is a substring of `"xyzz"`
- `"xy"` is a substring of `"xyzz"`
- `"z"` is a substring of `"xyzz"`

So, the count is `3`.

---


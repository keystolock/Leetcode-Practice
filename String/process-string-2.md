# Process String Problem

## Problem Statement
You are given a string `s` consisting of lowercase letters and special characters:
- `*` → acts as a backspace (removes one lowercase letter if available).
- `#` → doubles the current effective string length.
- `%` → reverses the effective string.

You are also given an index `k`.  
Your task is to determine the character at position `k` in the final processed string.  
If `k` is out of bounds, return `'.'`.

---

## Approach

### Step 1: Forward Pass (Length Calculation)
- Traverse the string from left to right.
- Maintain a variable `len` representing the effective length.
- Rules:
  - Lowercase letter → `len++`
  - `*` → `len--` (if `len > 0`)
  - `#` → `len *= 2`

This gives the final length of the processed string.

### Step 2: Backward Pass (Character Retrieval)
- Traverse the string from right to left.
- Adjust `len` and `k` based on operations:
  - Lowercase letter → if `k == len-1`, return this character; else `len--`
  - `*` → `len++`
  - `#` → `len /= 2`, update `k = k % len` (guard against `len == 0`)
  - `%` → reverse index, `k = len - 1 - k` (only if `len > 0`)

If no character is found, return `'.'`.

---

## Edge Cases
- Empty string → always return `'.'`
- `k >= len` → return `'.'`
- Guard against division/modulus when `len == 0`

---

## Complexity
- **Time Complexity:** `O(n)` (single forward + backward traversal)
- **Space Complexity:** `O(1)` (constant extra space)

---

## Example

### Input
# Process String Problem

## Problem Statement
You are given a string `s` consisting of lowercase letters and special characters:
- `*` → acts as a backspace (removes one lowercase letter if available).
- `#` → doubles the current effective string length.
- `%` → reverses the effective string.

You are also given an index `k`.  
Your task is to determine the character at position `k` in the final processed string.  
If `k` is out of bounds, return `'.'`.

---

## Approach

### Step 1: Forward Pass (Length Calculation)
- Traverse the string from left to right.
- Maintain a variable `len` representing the effective length.
- Rules:
  - Lowercase letter → `len++`
  - `*` → `len--` (if `len > 0`)
  - `#` → `len *= 2`

This gives the final length of the processed string.

### Step 2: Backward Pass (Character Retrieval)
- Traverse the string from right to left.
- Adjust `len` and `k` based on operations:
  - Lowercase letter → if `k == len-1`, return this character; else `len--`
  - `*` → `len++`
  - `#` → `len /= 2`, update `k = k % len` (guard against `len == 0`)
  - `%` → reverse index, `k = len - 1 - k` (only if `len > 0`)

If no character is found, return `'.'`.

---

## Edge Cases
- Empty string → always return `'.'`
- `k >= len` → return `'.'`
- Guard against division/modulus when `len == 0`

---

## Complexity
- **Time Complexity:** `O(n)` (single forward + backward traversal)
- **Space Complexity:** `O(1)` (constant extra space)

---

## Example

### Input
s = "ab#*c%"
k = 2


### Processing
1. Forward pass → compute length.  
2. Backward pass → trace operations to find the character at index `k`.

### Output
b


---



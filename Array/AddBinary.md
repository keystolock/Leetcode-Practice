# Binary String Full Adder

## 📌 Overview
This project implements a **full adder** in Java that adds two binary strings bit by bit.  
It uses XOR and AND logic to correctly handle carry propagation across all bits.

## ⚙️ Features
- Handles arbitrarily long binary strings
- Uses bitwise full adder logic (no overflow issues)
- Returns results as binary strings

## 🧩 Example
```java
Input: a = "1011", b = "1101"
Output: "11000"


## 🚀 How to Run
git clone https://github.com/your-username/full-adder-java.git

-Run these command in terminal
javac AddBinary.java
java AddBinary

# 📖 Explanation

Sum = (A ⊕ B) ⊕ CarryIn

CarryOut = (A ⊕ B) ∧ CarryIn ∨ (A ∧ B)

Loop continues until all bits and carry are processed.



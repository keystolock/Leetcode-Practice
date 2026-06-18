# Angle Between Clock Hands

## Problem Statement
Given the time in hours and minutes, calculate the smaller angle (in degrees) formed between the hour hand and the minute hand of a clock.

### Example
- Input: `hour = 3, minutes = 15`  
- Output: `7.5`

---

## Approach
1. **Hour hand movement**  
   - Each hour = 30° (`360° / 12`).  
   - Each minute contributes an additional `0.5°` to the hour hand (`30° / 60`).

   Formula:  
   

\[
   \text{hourAngle} = (hour \% 12) \times 30 + minutes \times 0.5
   \]



2. **Minute hand movement**  
   - Each minute = 6° (`360° / 60`).  

   Formula:  
   

\[
   \text{minuteAngle} = minutes \times 6
   \]



3. **Difference between hands**  
   - Compute absolute difference.  
   - Return the smaller angle between the two possible values (`diff` and `360 - diff`).

---

 # Complexity Analysis
Time Complexity: 
O(1)
 
Space Complexity: 
𝑂(1)
 — no extra data structures used.

**Edge Cases:** 

hour = 12, minutes = 0 → angle = 0°

hour = 0, minutes = 0 → angle = 0°

hour = 6, minutes = 0 → angle = 180°

hour = 1, minutes = 59 → angle close to 5.5°

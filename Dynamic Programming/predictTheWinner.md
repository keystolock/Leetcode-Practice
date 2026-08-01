# Predict the Winner 

## Problem Description
You are given an integer array `nums`. Two players are playing a game with this array: player 1 and player 2.

- Player 1 and player 2 take turns, with player 1 starting first.
- At each turn, the player takes one of the numbers from either end of the array (`nums[0]` or `nums[nums.length - 1]`).
- The chosen number is added to the player's score, and the array size reduces by 1.
- The game ends when there are no more elements in the array.

Return `true` if Player 1 can win the game. If the scores of both players are equal, Player 1 is still considered the winner.

You may assume that both players are playing optimally.

---

## Examples

**Example 1:**
Input: nums = [1,5,2]
Output: false

**Example 2:**
Input: nums = [1,5,233,7]
Output: true


---

## Constraints
- 1 <= nums.length <= 20  
- 0 <= nums[i] <= 10^7  


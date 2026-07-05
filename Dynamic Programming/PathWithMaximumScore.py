class Solution:
    def pathsWithMaxScore(self, board: List[str]) -> List[int]:
        MOD = 10**9 + 7
        n = len(board)
        grid = []
        self.dp = {}

        for i in range(n):
            row = []
            for ch in board[i]:
                if ch == 'X':
                    row.append(-1)
                elif ch in '123456789':
                    row.append(int(ch))
                else:  # 'S' or 'E'
                    row.append(0)
            grid.append(row)

        def dfs(i, j):
            if i >= n or j >= n or grid[i][j] == -1:
                return (-float('inf'), 0)

            if i == n-1 and j == n-1:
                return (0, 1)

            if (i, j) in self.dp:
                return self.dp[(i, j)]

            down = dfs(i+1, j)
            right = dfs(i, j+1)
            diagonal = dfs(i+1, j+1)

            max_sum = max(down[0], right[0], diagonal[0])
            total_paths = 0

            if down[0] == max_sum:
                total_paths = (total_paths + down[1]) % MOD
            if right[0] == max_sum:
                total_paths = (total_paths + right[1]) % MOD
            if diagonal[0] == max_sum:
                total_paths = (total_paths + diagonal[1]) % MOD

            self.dp[(i, j)] = (max_sum + grid[i][j], total_paths)
            return self.dp[(i, j)]

        max_sum, paths = dfs(0, 0)
        return [max_sum % MOD, paths % MOD] if max_sum != -float('inf') else [0, 0]
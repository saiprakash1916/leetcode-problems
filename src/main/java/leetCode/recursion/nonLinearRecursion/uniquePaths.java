package leetCode.recursion.nonLinearRecursion;

/*
    Leet code Problem No: 62. Unique Paths

    There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
    The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

    Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

    The test cases are generated so that the answer will be less than or equal to 2 * 109.

    Example 1:

    Input: m = 3, n = 7
    Output: 28
    Example 2:

    Input: m = 3, n = 2
    Output: 3
    Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
    1. Right -> Down -> Down
    2. Down -> Down -> Right
    3. Down -> Right -> Down
 */
public class uniquePaths {
    static int countPaths(int row, int col) {
        int[][] dp = new int[row][col];
        return paths(row - 1, col - 1, dp);
    }

    static int paths(int row, int col, int[][] dp) {
        if (row == 0 || col == 0) {
            return 1;
        }
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        dp[row][col] = paths(row - 1, col, dp) + paths(row, col - 1, dp);
        return dp[row][col];
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 7;
        System.out.println(countPaths(row, col));
    }
}

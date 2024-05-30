import java.util.Scanner;

public class MVP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        long[][] dp = new long[r + 1][c + 1];

        // Initialize base cases
        dp[0][0] = 1;

        // Fill in the DP array
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
                dp[i][j] %= (int) (1e9 + 7);
            }
        }

        // Print the result
        System.out.println(dp[r][c]);
    }
}

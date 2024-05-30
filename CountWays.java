import java.util.Scanner;

public class CountWays {

    private static final int MOD = 1000000;

    public static int countWays(int N, int K) {
        int[][] dp = new int[N + 1][K + 1];

        // Caso base: Solo hay una forma de sumar 0 números para obtener 0.
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }

        // Calculamos la cantidad de formas posibles utilizando programación dinámica.
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % MOD;
            }
        }

        return dp[N][K];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            if (N == 0 && K == 0) {
                break;
            }
            System.out.println(countWays(N, K));
        }
        scanner.close();
    }
}

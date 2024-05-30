import java.util.Scanner;

public class CoinChange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] coins = {1, 5, 10, 25, 50};
        long[] ways = new long[7490];
        
        ways[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= 7489; i++) {
                ways[i] += ways[i - coin];
            }
        }
        while (sc.hasNext()) {
            int amount = sc.nextInt();
            System.out.println(ways[amount]);
        }
    }
}

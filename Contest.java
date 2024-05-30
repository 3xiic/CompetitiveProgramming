
import java.util.Scanner;
import java.text.DecimalFormat;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();
            double x = (double) ((n * d) - (k * s)) / (n - k);
            if (x < 0 || x > 100) {
                System.out.println("impossible");
            } else {
                System.out.printf("%.6f", x);
            }
        }
    }
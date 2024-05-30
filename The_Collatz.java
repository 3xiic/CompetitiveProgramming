import java.util.Scanner;

public class The_Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (true) {
            int a = sc.nextInt();
            int limite = sc.nextInt();
            if (a < 0 && limite < 0) {
                break;
            }
            int terms = 1;
            while (a!=1 && a<=limite) {
                if (a%2==0) {
                    a =a/2;
                } else {
                    a =a*3+1;
                }
                terms++;
            }
            System.out.println("Case "+t+": A = "+ (a == 1 ? 1 : a)+", limit = "+limite+", number of terms = "+terms);
            t++;
        }
    }
}
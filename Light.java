import java.util.Scanner;

public class Light {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long n = sc.nextLong();
            
            if (n == 0) {
                break;
            }
            long sqrtN = (long) Math.sqrt(n);
            
            if (sqrtN * sqrtN == n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

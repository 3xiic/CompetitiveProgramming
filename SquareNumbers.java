import java.util.Scanner;
public class SquareNumbers{
 public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            if (n1 == 0 && n2 == 0) break;
            System.out.println(calculateSquare(n1,n2));
            
        }
    }
      public static int calculateSquare(int n1, int n2) {
          
        int count = 0;
        for (int i = (int) Math.sqrt(n1); i <= (int) Math.sqrt(n2); i++) {
            int mult = i*i;
            if (mult >= n1 && mult <= n2) count++;
        }
        return count;
        
    }
}


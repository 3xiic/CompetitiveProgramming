import java.util.Scanner;

public class Parity {
    
    public static int calculateParity(int n) {
        int parity = 0;
        
        String binary = Integer.toBinaryString(n);
        
        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                parity++;
            }
        }
        return parity ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("The parity of " + Integer.toBinaryString(n) + " is " + calculateParity(n) + " (mod 2).");
        }
    }
}

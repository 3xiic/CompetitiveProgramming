import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("Case "+(i+1)+": "+oddSum(n1, n2));
		}
	}
	
	
	public static int oddSum(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			if(!(i % 2 == 0)) {
				sum += i;
			}
		}
		return sum;
	}
}

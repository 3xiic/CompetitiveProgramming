import java.util.Scanner;

public class Cola {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(calculateMaxBottles(n));
		}
		sc.close();
	}
	
	public static int calculateMaxBottles(int n) {
		if(n < 1) {
			return 0;
		}
		int max = n;
		int empty= n;
		
		while (empty >= 3) {
			int newBottles = empty / 3;
			max += newBottles; 
			empty = empty % 3 + newBottles; 
		}
		
		if(empty == 2) {
			max += 1;
		}
		return max;
	}
}

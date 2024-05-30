import java.util.Scanner;

public class Egypt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if(pitagoras(a,b,c)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
	public static boolean pitagoras(int a, int b, int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2) || Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2);
	}
}

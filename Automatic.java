import java.util.Scanner;

public class Automatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String s = automaticAnswer(n)+"";
			System.out.println(s.charAt(s.length()-2));
		}
	}
	
	public static int automaticAnswer(int n) {
		 return (((((((n*567)/9)+7492)*235)/47)-498));
	}
}

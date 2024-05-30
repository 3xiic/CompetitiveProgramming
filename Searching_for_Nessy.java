import java.util.Scanner;

 public class Searching_for_Nessy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt()/3, b = sc.nextInt()/3;
			System.out.println(a*b);
		}
	}
}
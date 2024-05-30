import java.util.Scanner;

public class SummingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			if(s.equals("0")) break;
			System.out.println(calculate(s));
		}
	}
	
	public static String  calculate(String s) {
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(s.charAt(i)+"");
		}
	
		if(sum == 2) {
			return sum+"";
		}
		return calculate(sum+"");
	}
}

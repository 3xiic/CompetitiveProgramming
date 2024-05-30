import java.util.Scanner;

public class Eruption {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		double r= Math.sqrt((n/Math.PI));
		System.out.printf("%.9f",(double) (2*Math.PI*r));
	}
}

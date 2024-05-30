import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
			if(!String.valueOf(a).contains("7") && a % 7 !=0) {
				System.out.println(0);
			}else if(!String.valueOf(a).contains("7") && a % 7 ==0) {
				System.out.println(1);
			}else if(String.valueOf(a).contains("7") && a % 7 !=0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
}

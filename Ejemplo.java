import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>100000) {
			System.out.println("Numero muy grande");
		}else {
			System.out.println((num+"").length());
		}
	}
}

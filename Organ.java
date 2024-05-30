import java.util.Scanner;

public class Organ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String imp="";
        int x = 0;
        if(y==1) {
        	System.out.println(0);
        }else {
        	for (int i = 9; i >= 0; i--) {
				while(x+factorial(i)<=y) {
					x+=factorial(i);
					imp= i+imp;
				}
			}
        	System.out.println(imp);
        }
    }
  
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

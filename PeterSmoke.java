import java.util.Scanner;

public class PeterSmoke {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        while (sc.hasNextLine()) {
	            int n = sc.nextInt();
	            int k = sc.nextInt();
	            
	            System.out.println(maxCigarrillos(n, k));
	        }
	        
	    }
	    public static int maxCigarrillos(int n, int k) {
	        while (n >= k) {  
	            int nc = n / k;  
	            n += nc;  
	            n = n % k + nc; 
	        }
	        return n;
	    }
	}

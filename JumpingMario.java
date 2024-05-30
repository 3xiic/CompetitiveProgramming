import java.util.Scanner;

public class JumpingMario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(); 
            int[] walls = new int[n];
            
            for (int j = 0; j < n; j++) {
                walls[j] = sc.nextInt();
            }
           
            System.out.println("Case " + i + ": " + jumps(walls)[0] + " " + jumps(walls)[1]);
        }
        
    }
    public static int[] jumps( int[] walls) {
    	int[] jumps = new int[2];
    	jumps[0] = 0;
    	jumps[1] = 0;
    	for (int i = 0; i < walls.length-1; i++) {
			if(walls[i] < walls[i + 1]){
				jumps[0] ++;
			}else if(walls[i] > walls[i + 1]) {
				jumps[1] ++;
			}
		}
    	return jumps;
    }
}

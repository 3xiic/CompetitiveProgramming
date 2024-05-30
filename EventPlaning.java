import java.util.Scanner;

public class EventPlaning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int per = sc.nextInt();
			int bud = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			int best = 0;
			for (int i = 0; i < h; i++) {
				int price = sc.nextInt();
				boolean cond = false;
				for (int j = 0; j < w; j++) {
					int hab = sc.nextInt();
					if (hab >= per) {
						cond = true;
					}
				}
				if (((price*per) < best || best == 0) && cond) {
					best = price*per;
				}
			}
			if (best <= bud && best != 0) {
				System.out.println(best);
			} else {
				System.out.println("stay home");
			}
		}
	}
}

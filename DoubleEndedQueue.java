import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            System.out.println("Case "+ i+":");
            for (int j = 0; j < m; j++) {
                String s = sc.next();
                if (s.equals("pushLeft")) {
                    int x = sc.nextInt();
                    if (list.size() < n) {
                        list.addFirst(x);
                        System.out.println("Pushed in left: " + x);
                    } else {
                        System.out.println("The queue is full");
                    }
                } else if (s.equals("pushRight")) {
                    int x = sc.nextInt();
                    if (list.size() < n) {
                    	 list.addLast(x);
                        System.out.println("Pushed in right: " + x);
                    } else {
                        System.out.println("The queue is full");
                    }
                } else if (s.equals("popLeft")) {
                    if (list.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        int x = list.removeFirst();
                        System.out.println("Popped from left: " + x);
                    }
                } else if (s.equals("popRight")) {
                    if (list.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        int x = list.removeLast();
                        System.out.println("Popped from right: " + x);
                    }
                }
            }
        }
    }
}

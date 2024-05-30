import java.util.*;

public class Lucky2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] slices = new long[n];
        for (int i = 0; i < n; i++) {
            slices[i] = sc.nextLong();
        }
        long left = 0;
        long right = Arrays.stream(slices).max().getAsLong();
        while (left < right) {
            long mid = (left + right) / 2;
            long tolerance = mid;
            boolean canEatAll = true;
            for (int i = 0; i < n; i++) {
                if (slices[i] > tolerance) {
                    canEatAll = false;
                    break;
                }
                tolerance -= slices[i];
                tolerance += slices[i];
            }
            if (canEatAll) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}

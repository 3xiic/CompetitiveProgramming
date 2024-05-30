
import java.util.Scanner;

public class The_Knights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2= sc.next();
            String s3= sc.next();
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double r = Math.sqrt(area/Math.PI);

           System.out.println("The radius of the round table is: "+r);
        }
    }
}

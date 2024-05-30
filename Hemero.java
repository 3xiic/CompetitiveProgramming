import java.math.BigInteger;
import java.util.Scanner;

public class Hemero {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt(); 
	        BigInteger[] meses = new BigInteger[n];

	        for (int i = 0; i < n; i++) {
	            BigInteger dias = sc.nextBigInteger();
	            meses[i] = dias;
	        }

        int diaA = sc.nextInt();
        int mesA = sc.nextInt();
        int anoA = sc.nextInt();

        int diaR = sc.nextInt();
        int mesR = sc.nextInt();
        int anoR = sc.nextInt();

        BigInteger totalDiasAntiguos = totalDias(diaA, mesA, anoA, meses);

        BigInteger totalDiasRecientes = totalDias(diaR, mesR, anoR, meses);

        System.out.println(totalDiasRecientes .subtract(totalDiasAntiguos));
    }
    static BigInteger totalDiasAno(BigInteger[] months) {
        BigInteger total = BigInteger.ZERO;
        for (BigInteger days : months) {
            total = total.add(new BigInteger(days+""));
        }
        return total;
    }

    static BigInteger totalDias(int day, int month, int year, BigInteger[] months) {
        BigInteger totalDays = new BigInteger(day+"");
        totalDays = totalDays.subtract(BigInteger.ONE);

        for (int i = 0; i < month - 1; i++) {
            totalDays = totalDays.add(months[i]); 
        }

        totalDays = totalDays.add(totalDiasAno(months).multiply(new BigInteger((year-1)+"")));
        return totalDays;
    }
}
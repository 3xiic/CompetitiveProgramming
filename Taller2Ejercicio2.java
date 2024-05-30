public class Taller2Ejercicio2 {

	static String output = "";
	static double y1, y2;
	public static void main(String[] args) {
		System.out.println("Solucion no recursiva" +"\n--------------------");
		comparar();
		System.out.println();
		System.out.println("Solucion recursiva" +"\n------------------------");
		System.out.println(res());
	}

	public static void comparar() {
		System.out.println("Comparando...");
		long init = System.nanoTime();
		double y1, y2;
		for (int i = -50; i <= 50; i++) {
			y1 = (6 - Math.pow(i, 2));
			y2 = (4 - i);
			if (y1 == y2) {
				System.out.println("Posicion: "+i+" "+y1 + " = " + y2);
			}
		}
		System.out.println("Comparacion finalizada en " + (System.nanoTime() - init) + " ns.");
	}
	
	public static String compararRecursivo(int i) {
		if(i >= 50) {
			return output ;
		}
		else {
			y1 = (6 - Math.pow(i, 2));
			y2 = 4 - i;
			if(y1== y2) {
				output += "Posicion: "+i+", "+ y1 + " = " + y2 +"\n";
			}
		return compararRecursivo(i+1);		
		}
	}
		
	public static String res() {
		long init = System.nanoTime();
		return compararRecursivo(-50) +"\nComparacion finalizada en " + (System.nanoTime() - init) + " ns.";
	}
}

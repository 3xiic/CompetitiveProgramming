
public class point {
	public static void main(String[] args) {
//		System.out.println(ab(10,10));
		System.out.println(segundoCasoRecursivo(10000));
	}
	public static String ab( int columnas, int filas) {
		String res = "";
		for (int a = 0; a < filas; a++) {
			for (int b = 0; b < columnas; b++) {
				res += (a*b)+"  ";
			}
		}
		return  res;
	}
	
	public static String segundoCasoRecursivo(int i) {
		if(i == 0) return "#0";
		else {
			return segundoCasoRecursivo(i-4) + "#" + (i-3) + "#" + (i-2)
					+"#"+ (i-1) + "#" + i;
		}
	}

}

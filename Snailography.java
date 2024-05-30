import java.util.Scanner;

public class Snailography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los valores de entrada
        int n = Integer.parseInt(scanner.nextLine());
        String mensaje = scanner.nextLine();

        // Inicializar la tabla n x n con caracteres '#'
        char[][] tabla = new char[n][n];

        // Encontrar el centro de la tabla
        int centro = n / 2;
        int fila = centro, columna = centro;

        int direccion = 0; // 0: derecha, 1: abajo, 2: izquierda, 3: arriba
        int pasos = 1; // Número de pasos en la misma dirección
        int pasosTomados = 0; // Número de pasos tomados en la dirección actual

        // Iterar a través de los caracteres del mensaje y llenar la tabla en caracol
        for (char c : mensaje.toCharArray()) {
            tabla[fila][columna] = c;
            pasosTomados++;

            // Cambiar de dirección si se ha alcanzado el número máximo de pasos en la dirección actual
            if (pasosTomados == pasos) {
                pasosTomados = 0;
                if (direccion == 0) {
                    direccion = 1;
                } else if (direccion == 1) {
                    direccion = 2;
                    pasos++;
                } else if (direccion == 2) {
                    direccion = 3;
                } else if (direccion == 3) {
                    direccion = 0;
                    pasos++;
                }
            }

            // Moverse en la dirección actual
            if (direccion == 0) {
                columna++;
            } else if (direccion == 1) {
                fila++;
            } else if (direccion == 2) {
                columna--;
            } else if (direccion == 3) {
                fila--;
            }

            // Verificar si estamos fuera de los límites y necesitamos cambiar de dirección
            if (fila < 0 || fila >= n || columna < 0 || columna >= n) {
                if (direccion == 0) {
                    columna--;
                } else if (direccion == 1) {
                    fila--;
                } else if (direccion == 2) {
                    columna++;
                } else if (direccion == 3) {
                    fila++;
                }

                direccion = (direccion + 1) % 4; // Cambiar de dirección
            }
        }

        // Imprimir el mensaje encriptado en orden de filas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tabla[i][j] != '#') {
                    System.out.print(tabla[i][j]);
                }
            }
        }
        System.out.println();

        scanner.close();
    }
}

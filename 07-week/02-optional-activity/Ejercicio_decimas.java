import java.util.Scanner;

public class Ejercicio_decimas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Declarar matrices
        double[][] matrizA = new double[filas][columnas];
        double[][] matrizB = new double[filas][columnas];
        double[][] suma = new double[filas][columnas];
        double[][] resta = new double[filas][columnas];
        double[][] multiplicacion = new double[filas][columnas];
        double[][] division = new double[filas][columnas];

        // Llenar matriz A
        System.out.println("\nIngrese los valores de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        // Llenar matriz B
        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        // Operaciones
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
                resta[i][j] = matrizA[i][j] - matrizB[i][j];
                multiplicacion[i][j] = matrizA[i][j] * matrizB[i][j];

                if (matrizB[i][j] != 0) {
                    division[i][j] = matrizA[i][j] / matrizB[i][j];
                } else {
                    division[i][j] = 0; // evitar división por 0
                }
            }
        }

        // Mostrar resultados
        System.out.println("\nMatriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        System.out.println("\nSuma:");
        imprimirMatriz(suma);

        System.out.println("\nResta:");
        imprimirMatriz(resta);

        System.out.println("\nMultiplicación:");
        imprimirMatriz(multiplicacion);

        System.out.println("\nDivisión:");
        imprimirMatriz(division);
    }

    // Método para imprimir matrices
    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((int)matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
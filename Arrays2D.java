import java.util.Scanner;

public class Arrays2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                // 29. Suma de matrices: Escribe un programa que sume dos arrays 2D y muestre el resultado.
            
            int[][] array1 = {
                {9, 3, 7},
                {8, 2, 100},
                {6, 5, 1}
            };
            int[][] array2 = {
                {5, 4, 70},
                {7, 6, 1},
                {9, 0, 12}
            };

            int suma;

            for (int i=0; i<array1.length; i++) { 
                for (int j=0; j<array1[i].length; j++) { 
                    suma = array1[i][j] + array2[i][j];
                System.out.println("La suma de array1 y array dos en la posicion " + i + ", " + j + " = " + suma);
                }
            }
            
            
                // 30. Transpuesta de una matriz: Escribe un programa que encuentre e imprima la transpuesta de un array 2D.

            int[][] array = {
                {9, 3, 7},
                {8, 2, 100},
                {6, 5, 1}
            };

            int[][] transpuesta = new int[array.length][array.length];
            
            System.out.print("El array transpuesto queda como sigue: \n");
            
            for (int i=0; i<array.length; i++) {
                for (int j=0; j<array.length; j++) {
                    transpuesta[j][i] = array[i][j];
                    System.out.print(+ transpuesta[i][j] + " ");
                }
                System.out.println();
            }


        sc.close();
    }
}
import javax.swing.JOptionPane;

public class Arrays {

    public static void main(String[] args) {

            /*27. Encontrar el mayor elemento en un array: Escribe un programa que
            encuentre e imprima el mayor elemento en un array de enteros.*/

        int[] arraynum = {9, 3, 7, 8, 2, 100, 6, 5, 1, 4};
        int nummayor = arraynum[0];

        for (int i=1; i<arraynum.length; i++) { // el indice comienza en 1 pq 0 ya está leído dentro de nummayor
            if (arraynum[i] > nummayor) {
                nummayor = arraynum[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El número mayor del array es el " + nummayor);




            //  28. Invertir un array: Escribe un programa que invierta un array de enteros
        
                    // ME HABRÍA GUSTADO IMPRIMIR EL ORDEN ORIGINAL Y LUEGO EL INVERSO.... PERO EL TIEMPO APREMIA!!

        int[] array = {5, 45, 85, 64, 39, 10};
        StringBuilder arrayinverso = new StringBuilder("Array en orden inverso: \n");

        for (int i=array.length -1; i>=0; i--) {  // se pone el -1 para "compensar" que el array comienza en posición 0 y no en 1
            arrayinverso.append(array[i]).append(" "); // guarda cada elemento del array por donde pasa i y lo concatena para poder sacarlo junto en un cuadro de dialogo
        }
        
        JOptionPane.showMessageDialog(null, arrayinverso.toString());


    }
}
import javax.swing.JOptionPane;

public class BuclesFor {

    public static void main(String[] args) {

            /*23. Imprimir tabla de multiplicar: Escribe un programa que imprima la tabla de
            multiplicar de un número ingresado por el usuario usando un bucle for.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 23. Imprimir tabla de multiplicar \nEscribe un programa que imprima la tabla de multiplicar de un número ingresado por el usuario usando un bucle for");

        int numtabla = Integer.parseInt(JOptionPane.showInputDialog("Dime un número y te muestro la tabla de multiplicar de dicho número"));
        for (int i = 0; i <= 9; i++) {
            int tabla = numtabla * i;
            JOptionPane.showMessageDialog(null, "Te iré mostrando la tabla del " + numtabla + "\n" + numtabla + " por " + i + " = " + tabla);
        }


            /*24. Cálculo de factorial: Escribe un programa que calcule el factorial de un número
            usando un bucle for.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 24. Cálculo de factorial \nEscribe un programa que calcule el factorial de un número usando un bucle for");

        int numfact = Integer.parseInt(JOptionPane.showInputDialog("Voy a calcular el número factorial del número que tú me digas"));
        int factorial = 1;

        for (int i = 1; i <= numfact; i++) {
            factorial = factorial * i;
        }

        JOptionPane.showMessageDialog(null, "El factorial del número " + numfact + " es : " + factorial);
        

    }
}
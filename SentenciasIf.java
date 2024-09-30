import javax.swing.JOptionPane;

public class SentenciasIf {

    public static void main(String[] args) {

            /* 15. Verificar si un número es par o impar: Escribe un programa que lea un
            número del usuario y verifique si es par o impar. */
        JOptionPane.showMessageDialog(null, "EJERCICIO 15. Verificar si un número es par o impar \nEscribe un programa que lea un número del usuario y verifique si es par o impar");

        double numconsola = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número y te diré si es par o impar"));
        double num = numconsola / 2;  // divido el numero entre 2 para saber si da 0 o no

        if(num % 1 == 0) {  // % 1 coge el valor decimal de num, si es 0 es par, sino es impar
            JOptionPane.showMessageDialog(null, "El número " + numconsola + " es par");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numconsola + " es impar");
        }

            /* 16. Comprobar si un año es bisiesto: Escribe un programa para verificar si un año
            dado es bisiesto usando una sentencia if-else. */
        JOptionPane.showMessageDialog(null, "EJERCICIO 16. Comprobar si un año es bisiesto \nEscribe un programa para verificar si un año dado es bisiesto usando una sentencia if-else");

                            /* un año es bisiesto si:
                                Es divisible por 4 y no es divisible por 100, o
                                Es divisible por 400 */

        double año = Double.parseDouble(JOptionPane.showInputDialog("Introduce un año y te diré si es bisiesto o no"));
        double divis4 = año / 4;
        double divis100 = año / 100;
        double divis400 = año / 400;

        if(((divis4 % 1 == 0) && (divis100 % 1 != 0)) || (divis400 % 1 == 0)) {  // % 1 coge el valor decimal de num, si es 0 entonces es divisible
            JOptionPane.showMessageDialog(null, "El año " + año + " es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + año + " NO es bisiesto");
        }

    }
}
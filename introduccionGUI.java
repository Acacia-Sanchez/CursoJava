import javax.swing.JOptionPane;

public class IntroduccionGUI {
    public static void main(String[] args) {

            // EJERCICIO 9. Aplicación GUI simple: Crea una interfaz gráfica básica con JOptionPane que le pida al usuario su nombre y luego muestre un saludo.
        JOptionPane.showMessageDialog(null,"EJERCICIO 9: Aplicación GUI simple: Crea una interfaz gráfica básica con JOptionPane que le pida al usuario su nombre y luego muestre un saludo");

        String nombre = JOptionPane.showInputDialog(null,"Hola ¿me dices tu nombre?");
        JOptionPane.showMessageDialog(null,"Hola " + nombre);
        

            // EJERCICO 10. Calculadora GUI: Escribe una calculadora simple con interfaz gráfica usando JOptionPane que pueda sumar, restar, multiplicar y dividir dos números.
        
        JOptionPane.showMessageDialog(null,"10. Calculadora GUI: Escribe una calculadora simple con interfaz gráfica usando JOptionPane que pueda sumar, restar, multiplicar y dividir dos números.");

        String answer = JOptionPane.showInputDialog("¡Vamos a hacer cálculos matemáticos con 2 números! Escribe (da igual si usas mayúsculas o minúsculas) \n'S' si quieres sumar, 'R' si quieres restar, 'M' si quieres multiplicar o 'D' si quieres dividir");

        if(answer.equalsIgnoreCase("s")) {
                double sumaNum1 = Double.parseDouble(JOptionPane.showInputDialog("¡OK, sumemos pues! Dime el primer número: "));
                double sumaNum2 = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el segundo número: "));
                double suma = sumaNum1 + sumaNum2;
                JOptionPane.showMessageDialog(null, "Los números " + sumaNum1 + " y " + sumaNum2 + "... ¡TACHÁN! ¡Suman: " + suma + "!"); 
        }
        else if(answer.equalsIgnoreCase("r")) {
            double restaNum1 = Double.parseDouble(JOptionPane.showInputDialog("¡Vale, vamos a restar! Dime el primer número: "));
            double restaNum2 = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el segundo número: "));
            double resta = restaNum1 - restaNum2;
            JOptionPane.showMessageDialog(null, "Los números " + restaNum1 + " y " + restaNum2 + "... ¡TACHÁN! ¡Restan: " + resta + "!");
        }
        else if(answer.equalsIgnoreCase("m")) {
            double multiplicaNum1 = Double.parseDouble(JOptionPane.showInputDialog("De acuerdo, toca multiplicar! Dime el primer número: "));
            double multiplicaNum2 = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el segundo número: "));
            double multiplica = multiplicaNum1 * multiplicaNum2;
            JOptionPane.showMessageDialog(null, "Los números " + multiplicaNum1 + " y " + multiplicaNum2 + "... ¡TACHÁN! ¡Multiplicados dan un resultado de: " + multiplica + "!");
        }
        else if(answer.equalsIgnoreCase("d")) {
            double divideNum1 = Double.parseDouble(JOptionPane.showInputDialog("Bien, vamos a dividir! Dime el primer número: "));
            double divideNum2 = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el segundo número: "));
            double divide = divideNum1 / divideNum2;
            JOptionPane.showMessageDialog(null, "Los números " + divideNum1 + " y " + divideNum2 + "... ¡TACHÁN! ¡Multiplicados dan un resultado de: " + divide + "!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Perdona, no has pulsado ninguna de las 8 puñeteras letras que te he dado como opción. Vuelve en otro momento, graciassss ;)");
        }

    }
}

import javax.swing.JOptionPane;

public class ClaseMath {

    public static void main(String[] args) {

            // EJERCICIO 11. Operaciones matemáticas: Escribe un programa que demuestre el uso de Math.pow(), Math.sqrt(), y Math.abs().
        JOptionPane.showMessageDialog(null,"EJERCICIO 13. Operaciones matemáticas \nEscribe un programa que demuestre el uso de Math.pow(), Math.sqrt(), y Math.abs()");

            // Math.pow es para sacar el resultado de un número elevado a una potencia
        double base = 2;
        double exponente = 3;
        double resultado = Math.pow(base, exponente);
        JOptionPane.showMessageDialog(null, "Math.pow da el resultado de un número elevado a una potencia \n" + base + " elevado a " + exponente + " es: " + resultado);
        
            // Math.sqrt es para sacar el resultdo de una raíz cuadrada
        double numero = 16;
        double result = Math.sqrt(numero);
        JOptionPane.showMessageDialog(null, "Math.sqrt da el resultado de un raíz cuadrada \nLa raíz cuadrada de " + numero + " es: " + result);

            // Math.abs es para obtener el valor absoluto de un número, es decir que siempre devuelve el valor en positivo
        int numNegativo = -10;
        int numPositivo = 10;
        int absNegativo = Math.abs(numNegativo);
        int absPositivo = Math.abs(numPositivo);
        JOptionPane.showMessageDialog(null, "Math.abs da el valor absoluto de un número, es decir que siempre devuelve el valor en positivo \nEl valor absoluto de " + numNegativo + " es: " + absNegativo + "\nEl valor absoluto de " + numPositivo + " es: " + absPositivo);



            // EJERCICIO 12. Generar números aleatorios: Escribe un programa que genere e imprima un número entero aleatorio entre 1 y 100 usando la clase Math.    
        JOptionPane.showMessageDialog(null,"EJERCICIO 12. Generar números aleatorios \nEscribe un programa que genere e imprima un número entero aleatorio entre 1 y 100 usando la clase Math");

        int min = 1;
        int max = 100;
            // max - min +1 indica cuantos numeros tiene que barajar
            // ya que Math.random() solo baraja entre 0.0 y 1.0, multiplica dicho resultado por "los numeros a barajar" y le suma el min
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        JOptionPane.showMessageDialog(null, "El número aleatorio entre " + min + " y " + max + " es: " + aleatorio);

    }
}
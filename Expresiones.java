import java.util.Scanner;
import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            /* EJERCICIO 7. Expresiones aritméticas simples: Crea un programa que evalúe una expresión
            aritmética simple ingresada por el usuario (por ejemplo, 3 + 5 * 2).*/

        JOptionPane.showMessageDialog(null, "EJERCICIO 7. EXPRESIONES ARITMETICAS SIMPLES. \nCrea un programa que evalúe una expresión aritmética simple \ningresada por el usuario (por ejemplo, 3 + 5 * 2).");

        System.out.println();
        System.out.println("SI EL USUARIO TIENE QUE METER POR CONSOLA LA EXPRESION, NO SÉ HACERLO, NI PREGUNTANDOLE A LA IA...");
        System.out.println();
        

            /* EJERCICIO 8. Calcular área de un círculo: Escribe un programa que calcule el área de un
                círculo en función del radio ingresado por el usuario. */
                
        JOptionPane.showMessageDialog(null, "EJERCICIO 8. Calcular el área de un círculo. \nEn función del radio ingresado por el usuario");

        System.out.println("");
        
        System.out.println("Dime el radio de un círculo (en cm.) y yo te calculo el área!");
        double radio = sc.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);  // fórumula del área: Area = PI * radio al cuadrado
        
        System.out.println("");

        System.out.println("El área de un círculo de " + radio + " cm. de radio es igual a " + area + " cms.");
        
        System.out.println("");

        sc.close();
    }
}



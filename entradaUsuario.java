import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaUsuario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            /* 5. Leer y mostrar entrada del usuario: Escribe un programa que lea un entero,
            un número decimal y una cadena de texto ingresados por el usuario, luego
            muéstralos. */

        JOptionPane.showMessageDialog(null, "EJERCICIO 5. Leer y mostrar entrada del usuario: \nEscribe un programa que lea un entero, un número decimal y una cadena de texto \ningresados por el usuario, luego muéstralos.");

        System.out.println("");  // crea una línea en blanco

        System.out.println("Hola! Te voy a pedir unos datos y luego te los replico ¿Te parece?");

        System.out.println("");

        System.out.println("Dime un número entero");
        int entero = sc.nextInt();
        sc.nextLine(); // Consumir el carácter de nueva línea que no usan ni int ni double

        System.out.println("");

        System.out.println("Ahora dime un número con decimales");
        double decimal = sc.nextDouble();
        sc.nextLine(); // Consumir el carácter de nueva línea que no usan ni int ni double
        
        System.out.println("");
 
        System.out.println("Por último escríbeme un texto, ¡una simple frase si quieres!");
        String texto = sc.nextLine();

        System.out.println("");
        System.out.println("");
        
        System.out.println("Tu número entero fue el " + entero + "\nTu número decimal fue el " + decimal + "\nY tu frase fue " + texto);

        System.out.println("");

        
        
            /* 6. Suma de dos números: Escribe un programa que lea dos números enteros del
            usuario e imprima su suma. */
                    
        JOptionPane.showMessageDialog(null, "EJERCICIO 6. Suma de dos números: \nEscribe un programa que lea dos números enteros \r\ndel usuario e imprima su suma." );

        System.out.println("");

        System.out.println("Hola ¿me echas un cable? \n\nPor favor introduce un número entero");
        int num1 = sc.nextInt();
        sc.nextLine(); //por lo del último carácter comentado en el ejercicio anterior, es conveniente ponerlo siempre (al menos ahora que somos novatos)? aunque en este caso concreto no sea necesario

        System.out.println("");

        System.out.println("¡Introduce un segundo y último número, por favor!");
        int num2 = sc.nextInt();
        sc.nextLine();

        int suma = num1 + num2;

        System.out.println("");

        System.out.println("El primer número introducido es el " + num1 + "\nEl segundo número introducido es el " +num2);
        System.out.println("La suma de ambos números es: " + suma);

        System.out.println("");

        sc.close();
    }
}
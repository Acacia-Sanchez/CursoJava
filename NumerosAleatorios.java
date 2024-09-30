import java.util.Random;

import javax.swing.JOptionPane;

public class NumerosAleatorios {

    public static void main(String[] args) {

            /* 13. Simulador de tirada de dados: Crea un programa que simule la tirada de un
        par de dados usando números aleatorios. */
        
        JOptionPane.showMessageDialog(null, "EJERCICIO 13. Simulador de tirada de dados \nCrea un programa que simule la tirada de un par de dados usando números aleatorios");

        Random aleatorio = new Random();  //crea una instancia para generar números aleatorios
        int dado1 = aleatorio.nextInt(6)+1;  //almacena un número entero aleatorio entre 1 y 6
        int dado2 = aleatorio.nextInt(6)+1;  //el 6 es exclusivo, así que solo llegaría a 5, pero como le puse +1, empieza en 1 y le suma 1 al 5
        
        JOptionPane.showMessageDialog(null, "El primer dado ha sacado el número " + dado1 + "\nEl segundo dado ha sadado el número " +dado2);
        

            /* 14. Generador de contraseñas aleatorias: Escribe un programa que genere una
        contraseña aleatoria de 8 caracteres usando letras y dígitos. */

        JOptionPane.showMessageDialog(null, "EJERCICIO 14. Generador de contraseñas aleatorias \nEscribe un programa que genere una contraseña aleatoria de 8 caracteres usando letras y dígitos");

        Random aleat = new Random();
        int longit = 8; // Longitud de la contraseña
        String contraseña = ""; // inicialización de la variable contraseña

        for (int i = 0; i < longit; i++) {
            int tipoCaracter = aleat.nextInt(3); // aleatoriamente saca: 0, 1 ó 2 (se utilizarán en el switch-case de después)
            char caracter;
    
            switch (tipoCaracter) {
                case 0:
                    caracter = (char) (aleat.nextInt(10) + '0'); // Van a ser números (0-9, 10 caracteres posibles)
                    break;
                case 1:
                    caracter = (char) (aleat.nextInt(26) + 'A'); // Van a ser letras mayúsculas (A-Z, 26 caracteres posibles)
                    break;
                case 2:
                    caracter = (char) (aleat.nextInt(26) + 'a'); // Van a ser letras minúsculas (a-z, 26 caracteres posibles)
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + tipoCaracter);
            }
    
            contraseña += caracter; // hace que cada carácter se añada a la cadena contraseña
        }

        JOptionPane.showMessageDialog(null, "Esta es la contraseña generada: " + contraseña);


    }
}
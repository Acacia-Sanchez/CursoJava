import java.util.Random;

import javax.swing.JOptionPane;

public class BuclesWhile {

    public static void main(String[] args) {

            /*21. Suma de números naturales: Escribe un programa que calcule la suma de
            números naturales hasta un número dado usando un bucle while.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 21. Suma de números naturales \nEscribe un programa que calcule la suma de números naturales hasta un número dado usando un bucle while");

        int numstop = Integer.parseInt(JOptionPane.showInputDialog("Voy a sumar todos los números naturales, dime en que número quieres que pare"));
        int i = 1; // inicializamos el índice por donde empezaremos a sumar
        int suma = 0; // inicializamos suma, que recogerá la suma de i cada vez que pase por el bucle

        while (i <= numstop) {
            suma = suma + i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "La suma de todos los números naturales hasta el " + numstop + " es : " + suma);
        


            /*22. Juego de adivinar el número: Escribe un juego donde el usuario debe adivinar
            un número generado aleatoriamente entre 1 y 100.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 22. Juego de adivinar el número \nEscribe un juego donde el usuario debe adivinar un número generado aleatoriamente entre 1 y 100");

            // generamos un numero entero desde 0 a 100, que se almacena en "numero"
        Random aleatorio = new Random();  //crea una instancia para generar números aleatorios
        int numero = aleatorio.nextInt(101) +1;  //almacena el aleatorio generado, en la variable numero

        int intento = Integer.parseInt(JOptionPane.showInputDialog(null,"¡Vamos a jugar! Tienes que adivinar un número entero entre 1 y 100 \n\nIntroduce un número entero"));

        while (intento <= 100 && intento >= 1 && intento != numero) {

            if (intento < numero) {
                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "¡Lo siento! El " + intento + " es pequeño, inténtalo de nuevo con un número mayor"));
            }
            else {
                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "¡Lo siento! El " + intento + " es grande, inténtalo de nuevo con un número menor"));
            }

        }

            // está fuera del while, pq ha acertado o pq está fuera de rango, hay que comprobarlo!
        if (intento == numero) {
            JOptionPane.showMessageDialog(null, "¡Has acertado! El número aleatorio es: " + numero);
        }
        else {  // si no ha acertado, significa que está fuera de rango, así que lo informa
            JOptionPane.showMessageDialog(null, "Lo siento, has puesto un número que no está entre 1 y 100");
        }
        
    }
}
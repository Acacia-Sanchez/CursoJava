import javax.swing.JOptionPane;

public class OperadoresLogicos {

    public static void main(String[] args) {

            /* 19. Verificación de elegibilidad para votar: Escribe un programa para comprobar
            si un usuario es elegible para votar (edad >= 18) usando operadores lógicos.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 19. Verificación de elegibilidad para votar \nEscribe un programa para comprobar si un usuario es elegible para votar (edad >= 18) usando operadores lógicos");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad y te digo si puedes o no votar"));

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Tienes " + edad + " años, así que sí puedes votar");
        } else {
            JOptionPane.showMessageDialog(null, "Tienes " + edad + " años, así que NO puedes votar");
        }


            /* 20. Condiciones lógicas: Crea un programa que verifique si un número es positivo
            y par usando AND lógico, y si es negativo o divisible por 3 usando OR lógico.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 20. Condiciones lógicas \nCrea un programa que verifique si un número es positivo y par usando AND lógico, y si es negativo o divisible por 3 usando OR lógico");

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número y te digo si es positivo y par, o si es negativo o divisible por 3"));
        double div2 = numero / 2;  // divido el numero entre 2 para saber si da 0 o no
        double div3 = numero / 3;  // divido el numero entre 2 para saber si da 0 o no

        if ((numero >=0) && (div2 % 1 == 0)) {  // % 1 coge el valor decimal de num, si es 0 es par, sino es impar
            JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo y par");
        } 
        else if ((numero <0) && (div3 % 1 == 0)) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo y divisible entre 3");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no cumple ninguna de las condiciones mencionadas");
        }
        
    }
}

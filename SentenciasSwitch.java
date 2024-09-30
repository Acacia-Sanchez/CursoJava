import javax.swing.JOptionPane;

public class SentenciasSwitch {

    public static void main(String[] args) {
        
            /* 17. Calculadora simple usando switch: Escribe un programa que realice suma,
            resta, multiplicación o división según la entrada del usuario usando una
            sentencia switch.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 17. Calculadora simple usando switch \nEscribe un programa que realice suma, resta, multiplicación o división \nsegún la entrada del usuario usando una sentencia switch");

        Object[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int operacion = JOptionPane.showOptionDialog(null, "¡Vamos a hacer cálculos matemáticos con 2 números! \nElige una de las siguientes opciones y más adelante te pido los números con los que operar", "Pregunta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (operacion) {
            case 0 : 
                double snum1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número para la suma"));
                double snum2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número para la suma"));
                double suma = snum1 + snum2;
                JOptionPane.showMessageDialog(null, "El resultado de sumar " + snum1 + " + " + snum2 + " es : " + suma);
                break;
            case 1 :
                double rnum1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número para la resta"));
                double rnum2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número para la resta"));
                double resta = rnum1 - rnum2;
                JOptionPane.showMessageDialog(null, "El resultado de restar " + rnum1 + " + " + rnum2 + " es : " + resta);
                break;
            case 2 :
                double mnum1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número para la multiplicación"));
                double mnum2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número para la multiplicación"));
                double multiplica = mnum1 * mnum2;
                JOptionPane.showMessageDialog(null, "El resultado de multiplicar " + mnum1 + " + " + mnum2 + " es : " + multiplica);
                break;
            case 3 :
                double dnum1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número para la división"));
                double dnum2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número para la división"));
                double divide = dnum1 / dnum2;
                JOptionPane.showMessageDialog(null, "El resultado de dividir " + dnum1 + " + " + dnum2 + " es : " + divide);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lo siento no puedo realizar ninguna operación con esos datos");
                break;
        }

        
            /* 18. Días de la semana: Escribe un programa que convierta un número (1-7) en el
            día correspondiente de la semana usando una sentencia switch.*/
        JOptionPane.showMessageDialog(null, "EJERCICIO 18. Días de la semana \nEscribe un programa que convierta un número (1-7) en el día correspondiente de la semana usando una sentencia switch");
        
        int numdia = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 7 y te digo a qué día de la semana se corresponde"));

        switch (numdia) {
            case 1 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es lunes");
                break;
            case 2 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es martes");
                break;
            case 3 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es miércoles");
                break;
            case 4 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es jueves");
                break;
            case 5 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es viernes");
                break;
            case 6 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es sábado");
                break;
            case 7 :
                JOptionPane.showMessageDialog(null, "El día " + numdia + " es domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lo siento ese no es un día válido");
                break;
        }
        
        
    }
}
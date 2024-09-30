public class Intercambiar2Variables {
   
   public static void main(String[] args) {
      
         /* EJERCICO 3. Intercambiar usando operaciones aritméticas: Modifica el ejercicio anterior
         para intercambiar dos enteros usando operaciones aritméticas (por ejemplo,
         suma y resta).
         */
        
      System.out.println();
      
      int a = 235;
      int b = 536;
      System.out.println("A es:" + a);
      System.out.println("B es:" + b);
      
      a = a + b;
      b = a - b;
      a = a - b;
      
      System.out.println();
      System.out.println("EJERCICIO 3. Después del intercambio, usando operaciones aritméticas");
      System.out.println("Ahora A es:" + a);
      System.out.println("Ahora B es:" + b);

      
         /* EJERCICIO 4. Intercambiar usando XOR bit a bit: Intercambia dos variables enteras usando
            la operación bit a bit XOR. */
   
      /* LO HE COPIADO DE LA IA... Sé que XOR tiene la propiedad de que si lo aplicas dos veces con el mismo valor,
         recuperas el valor original. Aunque no lo entiendo muy bien, y lo que no entiendo ni papa es lo del intercambio de bits... */
      
      System.out.println();
         
      a = a ^ b; // a ahora es 15 (0101 ^ 1010 = 1111)
      b = a ^ b; // b ahora es 5 (1111 ^ 1010 = 0101)
      a = a ^ b; // a ahora es 10 (1111 ^ 0101 = 1010)
      
      System.out.println("EJERCICIO 4. Después del intercambio,usando XOR bit a bit");
      System.out.println("Ahora a es: " + a);
      System.out.println("Ahora b es: " + b);
      System.out.println();
      System.out.println("Volvimos a intercambiar los contenidos de A y B, así que ahora quedan como al principio del Ej. 3");
      System.out.println();
      
   }
}
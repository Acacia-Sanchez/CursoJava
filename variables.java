public class variables {

  public static void main(String[] args) {
    
      // 1. Declaración e inicialización de variables
      int entera = 8;
      float decimales = 13.3f;
      char simbolo = '&';
      boolean seguro = false;
    
      System.out.println(entera);
      System.out.println(decimales);
      System.out.println(simbolo);
      System.out.println(seguro);

    // 2. Intercambio de 2 variables enteras, sin una tercera variable

    int a = 2354312;
    int b = 5362326;
    System.out.println("A es:" + a);
    System.out.println("B es:" + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Ahora A es:" + a);
    System.out.println("Ahora B es:" + b);

    }
}

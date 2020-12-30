public class HolaMundo {

  public static void main(String[] args) {
    String saludo = "Hola mundo";
    System.out.println(saludo);
    System.out.println("saludo.toLowerCase() = " + saludo.toLowerCase());

    // tipos primitivos siempre en minúscula
    int numero = 10;
    System.out.println("numero = " + numero);

    boolean valor = true;

    int numero2;
    numero2 = 5;
    if (valor) {
      numero2 = 10;
    }

    System.out.println("numero2 = " + numero2);

    var numero3 = 15; // dynamic

    String nombre;
    nombre = "Andres";
  }
}

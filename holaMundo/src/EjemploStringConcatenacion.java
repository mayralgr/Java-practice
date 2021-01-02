public class EjemploStringConcatenacion {
  public static void main(String[] args) {
    String curso = "Programación Java";
    String profesor = "Andrés Guzmán";

    String detalle = curso + " con el profesor "+ profesor;
    System.out.println("detalle = " + detalle);

    // Con numeros
    int numeroA = 10;
    int numeroB = 5;
    // precedencia de operadores, primero encuentra una cadena. A menos que se usen parentesis
    System.out.println(detalle + (numeroA + numeroB));
    System.out.println(numeroA + numeroB + detalle);

    // Otra forma, no lo modifica, son inmutables, regresa uno nuevo
    // es más eficiente, el + ==> concatena por string builder y concatena
    String detalle2 = curso.concat(" con ").concat(profesor);
    System.out.println("detalle2 = " + detalle2);
  }
}

public class EjemploStringValidar {

  public static void main(String[] args) {
    String curso = null;
    boolean esNulo = curso == null;
    System.out.println("esNulo = " + esNulo);

    if (esNulo) {
      // curso = "Programación en Java";
      curso = " ";
    }
    /*if (!esNulo) {
      System.out.println(curso.toUpperCase());
    }*/
    // System.out.println("curso.concat(\"desde cero\") = " + curso.concat("desde cero")); // Null pointer
    // System.out.println("Bienvenido al curso ".concat(curso)); // Null pointer
    boolean esVacio = curso.length() == 0;
    System.out.println("esVacio = " + esVacio);
    
    boolean esVacio2 = curso.isEmpty(); // evalua el length == 0
    System.out.println("esVacio2 = " + esVacio2);

    // is blanck solo existe desde jdk 11
    boolean isBlank = curso.isBlank(); // + estricto, evalua si tiene un caracter espacio o esta vacia
    System.out.println("isBlank = " + isBlank);

    if (!esVacio && !isBlank) {
      System.out.println(curso.toUpperCase());
      System.out.println("Bienvenido al curso " + curso); // Si es null, null se imprime
      System.out.println("Bienvenido al curso ".concat(curso));
    }

  }
}

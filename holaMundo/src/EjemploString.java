public class EjemploString {
  public static void main(String[] args) {
    String curso = "Programación Java";
    String curso2 = new String("programación Java");

    // Comparar el objeto
    boolean esIgual = curso == curso2;
    System.out.println("curso == curso2 " + esIgual);

    // Compara por valor
    esIgual = curso.equals(curso2);
    System.out.println("curso.equals(curso2) " + esIgual);

    // Ignore case
    esIgual = curso.equalsIgnoreCase(curso2);
    System.out.println("curso.equalsIgnoreCase(curso2) " + esIgual);

    String curso3 = "Programación Java";
    // Apuntan a la misma memoria, por eso true
    esIgual = curso == curso3;
    System.out.println("curso == curso3 " + esIgual);
  }
}

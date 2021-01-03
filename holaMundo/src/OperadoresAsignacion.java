public class OperadoresAsignacion {
  public static void main(String[] args) {
    int i = 5;
    int j = i + 4;

    // Combinados o compuestos
    i = i + 2;
    i +=2;

    j-= 4;


    String sqlString = "select * from clientes as c";
    sqlString += "where c.nombre 'Andres";

    System.out.println("sqlString = " + sqlString);
  }
}

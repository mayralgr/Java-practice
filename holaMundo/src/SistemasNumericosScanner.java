import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero entero:");
    try {
      int numeroDecimal = scanner.nextInt();
      String resultadoBinario = "numero binario de " + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal);
      String resultadoOctal = "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
      String resultadoHex = "\nnumero hex de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

      String mensaje = resultadoBinario;
      mensaje += resultadoOctal;
      mensaje += resultadoHex;
      System.out.println("mensaje = " + mensaje);
    }
    catch (InputMismatchException e){
      System.out.println("Error debe ser un numero entero");
      main(args);
      System.exit(0);
    }
  }

}

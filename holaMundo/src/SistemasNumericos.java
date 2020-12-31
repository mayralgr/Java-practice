import javax.swing.*;

public class SistemasNumericos {

  public static void main(String[] args) {
    //int numeroDecimal = 500;
    String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
    try {

      int numeroDecimal = Integer.parseInt(numeroStr);
      // convertirlo en diferentes tipos numericos
      System.out.println("numeroDecimal = " + numeroDecimal);
      // binario
      System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

      int numeroBinario = 0b111110100;
      System.out.println("numeroBinario = " + numeroBinario);
      //octal
      System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
      int numeroOctal = 0764;
      System.out.println("numeroOctal = " + numeroOctal);
      // hexadecimal
      System.out.println("numero hex de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

      int hex = 0x1f4;
      System.out.println("hex = " + hex);

      String mensaje = "numero binario de " + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal);
      mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
      mensaje += "\nnumero hex de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
      JOptionPane.showMessageDialog(null, mensaje);
    }
    catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Error debe ser un numero entero");
      main(args);
      System.exit(0);
    }
  }

}

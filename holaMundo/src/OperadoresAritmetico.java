import javax.swing.*;

public class OperadoresAritmetico {
  public static void main(String[] args) {
    int i = 5;
    int j = 4;
    int suma = i + j;
    System.out.println("suma = " + suma);

    int resta = i-j;
    System.out.println("resta = " + resta);
    // En otra cosa que no sea suma, se deben color los parentesis
    System.out.println("(i-j) = " + (i-j));

    int mult = i*j;
    System.out.println("mult = " + mult);
    
    float div = (float) i / j;
    System.out.println("div = " + div);

    int resto = i % j;
    System.out.println("resto = " + resto);

    int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    if ( numero % 2 == 0 ) {
      System.out.println("numero par = " + numero);
    }
    else {
      System.out.println("numero impar = " + numero);
    }
  }
}

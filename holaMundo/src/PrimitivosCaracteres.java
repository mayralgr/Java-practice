public class PrimitivosCaracteres {
  public static void main(String[] args) {
    char caracter = '\u0040';
    char decimal = 64;
    System.out.println("decimal = " + decimal);
    System.out.println("caracter = " + caracter);
    System.out.println("(decimal==caracter) = " + (decimal==caracter));
    System.out.println("char en byte" + Character.BYTES );
    System.out.println("char en size" + Character.SIZE );
    System.out.println("char min value" + Character.MIN_VALUE );
    System.out.println("char max value" + Character.MAX_VALUE );

    char espacio = '\u0020';
    char backspace = '\b';
    char tabulador = '\t';
    char nuevaLinea = '\n';
    char retornoCarro = '\r'; // regresa al punto de partida de la linea

  }
}

public class OperadorInstanceOfTiposGenericos {
  public static void main(String[] args) {
    Object texto = "Creando un objecto de la clase string";

    Integer num = 7;

    boolean b1 = texto instanceof String;
    System.out.println("texto String? " + b1);

    b1 = texto instanceof Object;
    System.out.println("texto Object? " + b1);

    b1 = texto instanceof Integer;
    System.out.println("texto Integer? " + b1);

    b1 = num instanceof Integer;
    System.out.println("num Integer? " + b1);

    Double decimal = 45.54;
    b1 = decimal instanceof  Number;
    System.out.println("decimal Number? " + b1);


  }
}

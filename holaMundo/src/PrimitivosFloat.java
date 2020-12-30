public class PrimitivosFloat {

  public static void main(String[] args) {
    float realFloat = 3.4028235E38f;//2120f;
    System.out.println("realFloat = " + realFloat);
    System.out.println("tipo float corresponde a "+ Float.BYTES);
    System.out.println("tipo float corresponde en bits a  "+ Float.SIZE);
    System.out.println("valor maximo de un float "+ Float.MAX_VALUE);
    System.out.println("valor minimo de un float "+ Float.MIN_VALUE);

    double doble =1.7976931348623157E308D;
    System.out.println("doble = " + doble);
    System.out.println("tipo doble corresponde a "+ Double.BYTES);
    System.out.println("tipo doble corresponde en bits a  "+ Double.SIZE);
    System.out.println("valor maximo de un doble "+ Double.MAX_VALUE);
    System.out.println("valor minimo de un doble "+ Double.MIN_VALUE);
    
    var something = 3.1416;
    System.out.println("something = " + something);
  }
}

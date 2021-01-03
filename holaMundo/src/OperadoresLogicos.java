public class OperadoresLogicos {
  public static void main(String[] args) {

    // And y or ==> efecto corto circuito
    int i = 3;
    byte j = 3;
    float k = 127e-7f;
    double l = 2.1413e3;
    boolean m = false;

    boolean b1 = i == j &&  k < l;
    System.out.println("b1 = " + b1);

    // And tiene prioridad
    boolean b4 = i== j || k <l && m == true;
    System.out.println("b4 = " + b4);
  }
}

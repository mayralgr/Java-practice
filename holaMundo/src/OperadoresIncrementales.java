public class OperadoresIncrementales {
  public static void main(String[] args) {
    // preincemento
    int i = 1;
    int j = ++i; // 2
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    // post incremento
    i = 2;
    j = i++; // j = 2, i= 3
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    // pre decremento
    i = 3; //
    j = --i; // 2
    System.out.println("predecremento");
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    // post decremento
    i = 4;
    j = i--; // j = 4, i = 3
    System.out.println("postdecremento");
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    System.out.println("(++j) = " + (++j));
    System.out.println("(j++) = " + (j++));

  }
}

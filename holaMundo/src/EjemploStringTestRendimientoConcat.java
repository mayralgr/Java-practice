public class EjemploStringTestRendimientoConcat {
  public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = a;

    // String builder es mutable
    StringBuilder sb = new StringBuilder(a);

    long inicio = System.currentTimeMillis();

    for (int i = 0; i < 10000; i++) {
      //c = c.concat(a).concat(b).concat("\n"); // 3 ms, 6 ms, 10000 => 94ms
      //c += a + b + "\n"; // 20 ms, 21ms, 10000 => 77 ms
      sb.append(a).append(b).append("\n"); // 0 ms, 1 ms, 10000 => 3ms
    }

    long fin = System.currentTimeMillis();
    System.out.println(fin-inicio);
    // System.out.println("c = " + c);
    System.out.println("sb = " + sb.toString());
  }
}

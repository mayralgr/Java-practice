public class ConversionEntrePrimitivos {
  public static void main(String[] args) {
    int i = 32768;

    short s = (short) i;
    System.out.println("s = " + s);
    long l = i;
    System.out.println("l = " + l);
    System.out.println(Short.MAX_VALUE);
  }
}

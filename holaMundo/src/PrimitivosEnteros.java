public class PrimitivosEnteros {

  public static void main(String[] args) {

    // byte
    byte numeroByte = 7;
    System.out.println("numeroByte = " + numeroByte);
    System.out.println("tipo byte corresponde a "+ Byte.BYTES);

    System.out.println("tipo byte corresponde en bits a  "+ Byte.SIZE);
    System.out.println("valor maximo de un byte "+ Byte.MAX_VALUE);
    System.out.println("valor minimo de un byte "+ Byte.MIN_VALUE);

    // short
    short numeroShort = 32767;
    System.out.println("numeroShort = " + numeroShort);
    System.out.println("tipo short corresponde a "+ Short.BYTES);

    System.out.println("tipo short corresponde en bits a  "+ Short.SIZE);
    System.out.println("valor maximo de un short "+ Short.MAX_VALUE);
    System.out.println("valor minimo de un short "+ Short.MIN_VALUE);

    // int
    int numeroInt = 32768;
    System.out.println("numeroInt = " + numeroInt);
    System.out.println("tipo int corresponde a "+ Integer.BYTES);

    System.out.println("tipo int corresponde en bits a  "+ Integer.SIZE);
    System.out.println("valor maximo de un int "+ Integer.MAX_VALUE);
    System.out.println("valor minimo de un int "+ Integer.MIN_VALUE);

    // long
    long numeroLong = 9223372036854775807L;
    System.out.println("numeroLong = " + numeroLong);
    System.out.println("tipo long corresponde a "+ Long.BYTES);

    System.out.println("tipo long corresponde en bits a  "+ Long.SIZE);
    System.out.println("valor maximo de un long "+ Long.MAX_VALUE);
    System.out.println("valor minimo de un long "+ Long.MIN_VALUE);

    var numeroVar = 127;
  }
}

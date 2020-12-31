public class ConversionDeTipos {

  public static void main(String[] args) {
    String numeroStr = "58";
    int numeroInt = Integer.parseInt(numeroStr);
    System.out.println("numeroInt = " + numeroInt);
    
    String realStr = "98765.43e-3";
    double realdouble = Double.parseDouble(realStr);
    System.out.println("realdouble = " + realdouble);
    
    String logicoStr = "true";
    boolean logicBoolean = Boolean.parseBoolean(logicoStr);
    System.out.println("logicBoolean = " + logicBoolean);

    int otroNumero = 100;
    System.out.println("otroNumero = " + otroNumero);

    String otroNumeroStr = Integer.toString(otroNumero);
    System.out.println("otroNumeroStr = " + otroNumeroStr);

    otroNumeroStr = String.valueOf(otroNumero+10);
    System.out.println("otroNumeroStr = " + otroNumeroStr);

  }}

public class EjemploStringMetodosArreglo {
  public static void main(String[] args) {
    
    String trabalenguas = "trabalenguas";
    System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

    char[] arreglo = trabalenguas.toCharArray();
    int largo = arreglo.length;
    System.out.println("largo = " + largo);
    for (int i = 0; i < largo; i++) {
      System.out.println("arreglo[i] = " + arreglo[i]);
    }

    System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
    String [] strArray = trabalenguas.split("a");
    for (int i = 0; i < strArray.length; i++) {
      System.out.println("strArray = " + strArray[i]);
    }

    String archivo = "alguna.imagen.pdf";
    String[] archivoArr = archivo.split("\\."); // se tiene que escapar o colocar entre corchetes []
    for (int i = 0; i < archivoArr.length; i++) {
      System.out.println("archivoArr = " + archivoArr[i]);
    }

    System.out.println("archivoArr[archivoArr.length-1] = " + archivoArr[archivoArr.length-1]);
  }
}

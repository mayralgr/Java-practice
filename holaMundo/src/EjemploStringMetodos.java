public class EjemploStringMetodos {
  public static void main(String[] args) {
    String nombre = "Lucero";
    System.out.println("nombre.length() = " + nombre.length());
    System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
    System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
    System.out.println("nombre.equals(\"Lucero\") = " + nombre.equals("Lucero"));
    System.out.println("nombre.equals(\"lucero\") = " + nombre.equals("lucero"));
    System.out.println("nombre.equalsIgnoreCase(\"lucero\") = " + nombre.equalsIgnoreCase("lucero"));
    System.out.println("nombre.compareTo(\"Lucero\") = " + nombre.compareTo("Lucero"));
    System.out.println("nombre.compareTo(\"Luz\") = " + nombre.compareTo("Luz")); // < 0, nombre va antes
    System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
    System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
    System.out.println("nombre.substring(1) = " + nombre.substring(1)); // inclusivo
    // System.out.println("nombre.substring(5,2) = " + nombre.substring(5,2)); // no se pueden intercambiar
    System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));
    System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

    String trabalenguas = "trabalenguas";
    System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
    System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // solo regresa la primera ocurrencia
    System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
    System.out.println("trabalenguas.indexOf('x') = " + trabalenguas.indexOf('x'));
    System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
    System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
    System.out.println("trabalenguas.startsWith = " + trabalenguas.startsWith("hola"));
    System.out.println("trabalenguas.endsWith(\"enguas\") = " + trabalenguas.endsWith("enguas"));
    System.out.println("     trabalenguas =    ");
    System.out.println("     trabalenguas =    ".trim());
  }
}

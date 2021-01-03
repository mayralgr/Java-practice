import java.util.Scanner;

public class OperadoresLogicosLogin {
  public static void main(String[] args) {
    /*String[] usernames = new String[2];
    usernames[0] = "lucero";
    usernames[1] = "admin";

    String[] passwords = new String[2];
    passwords[0] = "12345";
    passwords[1] = "5678";

    String username = "lucero";
    String pass = "12345";*/

    String[] usernames = {"lucero", "admin"};
    String[] passwords = {"12345", "5678"};

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su nombre");

    String u = sc.next();

    System.out.println("Ingrese el password");
    String p = sc.next();

    boolean esAutenticado = false;

    for (int i = 0; i < usernames.length; i++) {
      /*if(usernames[i].equalsIgnoreCase(u) &&
         passwords[i].equals(p)) {
        esAutenticado = true;
        break;
      }*/
      esAutenticado = (usernames[i].equalsIgnoreCase(u) &&
                       passwords[i].equals(p)) ? true : esAutenticado;

    }


    if (esAutenticado) {
      System.out.println("Login!");
    } else {
      System.out.println("Not logged in");
    }
  }

}

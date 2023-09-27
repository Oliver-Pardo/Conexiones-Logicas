
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ejercicio12 {
  public static void main(String[] args) {
    boolean credencialesAdministrador = true;
    Set<String> ipPermitida = new HashSet<>(Arrays.asList("199.99.9.9", "198.888.8.8"));
    String direccionIP = "199.999.9.9";
    if ((credencialesAdministrador && ipPermitida.contains(direccionIP)) == true) {
      System.out.println("Acceso concedido");
    } else {
      System.out.println("Acceso denegado");
    }
  }
}

import javax.swing.JOptionPane;


public class ejercicio1 {
  public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero%3==0 && numero%5==0) {
            JOptionPane.showMessageDialog(null, "el numero es divisible por 3 y por 5");
        } else {
            JOptionPane.showMessageDialog(null, "no es divisible por 3 y por 5");

        }
    }
}
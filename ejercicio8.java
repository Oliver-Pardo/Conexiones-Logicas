
import javax.swing.JOptionPane;


public class ejercicio8 {
   public static void main(String[] args) {
        String llave;
        llave=JOptionPane.showInputDialog("tiene la llave si/no");
        if (llave.equals("si")) {
            JOptionPane.showMessageDialog(null, "puede abrir la puerta");
        }else{
            JOptionPane.showMessageDialog(null, "No puede abrir la puerta");
        }

    }
}
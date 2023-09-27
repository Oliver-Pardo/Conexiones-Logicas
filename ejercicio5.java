
import javax.swing.JOptionPane;


public class ejercicio5 {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (!(numero<=0)) {
            JOptionPane.showMessageDialog(null, "el numero es valido");
        }else{
            JOptionPane.showMessageDialog(null,"el numero es invalido");
        }
    }
}

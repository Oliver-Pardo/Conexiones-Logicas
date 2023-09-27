
import javax.swing.JOptionPane;


public class ejercicio7 {
    public static void main(String[] args) {
        int ingreso;
        String credito;
        ingreso=Integer.parseInt(JOptionPane.showInputDialog("cuales son sus ingresos mensuales"));
        credito= JOptionPane.showInputDialog("¿tiene credito(s) por pagar?  si/no");
        if (ingreso>=2000 && credito.equals("no")) {
            JOptionPane.showMessageDialog(null, "Puede solicitar una tarjeta de credito");
        }else{
            JOptionPane.showMessageDialog(null, "No puede solicitar una tarjeta de credito");

        }
    }
}
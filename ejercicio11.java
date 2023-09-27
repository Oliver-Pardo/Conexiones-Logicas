
import javax.swing.JOptionPane;


public class ejercicio11 {
    public static void main(String[] args) {
        String CredencialesAdministrador, ipPermitida;
        CredencialesAdministrador = JOptionPane.showInputDialog("tiene credenciales de administrador? si/no");
        ipPermitida = JOptionPane.showInputDialog("¿Su ip se encuentra en la lista de direcciones permitidas? si/no");
        if (CredencialesAdministrador.equals("si") && ipPermitida.equals("si")) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        }else{
            JOptionPane.showMessageDialog(null,"Acceso denegado");
        }
    }
}

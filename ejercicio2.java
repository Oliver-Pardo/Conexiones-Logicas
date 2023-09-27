
import javax.swing.JOptionPane;


public class ejercicio2 {
    public static void main(String[] args) {
        String id, id1, contraseña, contraseña1;
        id="usuario123";
        contraseña="contraseña456";
        id1= JOptionPane.showInputDialog("ingrese el usuario de ingreso");
        contraseña1=JOptionPane.showInputDialog("ingrase la Contraseña");

        if(id.equals(id1) && contraseña.equals(contraseña1)) {
            JOptionPane.showMessageDialog(null,"puede ingresar");
        }
        else{
            JOptionPane.showMessageDialog(null,"no puede ingresar");

        }
    }
}

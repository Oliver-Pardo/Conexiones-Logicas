
import javax.swing.JOptionPane;


public class ejercicio10 {
    public static void main(String[] args) {

        String usuario="usuario12" , usuario2, codigo="159753", codigo2;
        usuario2=JOptionPane.showInputDialog("ingrese el nombre de usuario");
        codigo2=JOptionPane.showInputDialog("ingrese el codigo de verificacion llegado a su correo electronico");
        if ((usuario2.equals(usuario) && codigo2.equals(codigo))||((!usuario2.equals(usuario) && !codigo2.equals(codigo)))) {
            JOptionPane.showMessageDialog(null,"Acceso concedido");
        }else {
            JOptionPane.showMessageDialog(null, "acceso denegado");

        }


    }
}
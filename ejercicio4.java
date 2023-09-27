
import javax.swing.JOptionPane;


public class ejercicio4 {
   public static void main(String[] args) {
        int experiencia;
        String admin;
        admin = JOptionPane.showInputDialog("¿eres administrador? si/no ");
        experiencia=Integer.parseInt(JOptionPane.showInputDialog("ingrese su experiencia"));
        if (admin.equals("si") || experiencia>=1000) {
            JOptionPane.showMessageDialog(null, "puede ingresar");
        } else{
            JOptionPane.showMessageDialog(null, "no puede ingresar");

        }
    }
}
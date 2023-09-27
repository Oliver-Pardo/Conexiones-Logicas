
import javax.swing.JOptionPane;


public class ejercicio6 {
  public static void main(String[] args) {
        int nota;
        nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota del examen para dar un resultado"));
        if (!(nota<=60)) {
            JOptionPane.showMessageDialog(null, "Estudiante aprobado");
        }else{
            JOptionPane.showMessageDialog(null, "estudiante no aprobado");
        }

    }
}

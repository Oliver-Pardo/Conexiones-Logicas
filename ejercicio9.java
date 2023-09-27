
import javax.swing.JOptionPane;


public class ejercicio9 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (num%2==0) {
            JOptionPane.showMessageDialog(null, "es par");
        }else{
          JOptionPane.showMessageDialog(null, "no es par");
        }
    }
}

import javax.swing.JOptionPane;


public class ejercicio3 {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para ser evaluado"));
        if (numero%2==0 || numero%3==0) {
            JOptionPane.showMessageDialog(null, "el numero es divisible por 3 o es numero par");       
        }else{
            JOptionPane.showMessageDialog(null, "el numero ingresado no es divisible por 3 y no es par ");

        }
    }
    }

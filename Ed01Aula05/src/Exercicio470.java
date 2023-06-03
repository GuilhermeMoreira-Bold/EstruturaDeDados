import javax.swing.*;

public class Exercicio470 {
    public static void main(String[] args) {
        Primo primo = new Primo();
        primo.ler_num1();
        if (primo.éPrimo() == true) {
            System.out.println(JOptionPane.showInputDialog(primo.numero + " é primo"));
        } else {
            System.out.println(JOptionPane.showInputDialog(primo.numero + " não é primo"));
        }
    }
}

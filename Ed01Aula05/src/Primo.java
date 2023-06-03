import javax.swing.*;

public class Primo
{
    int numero;
    void ler_num1(){
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero: "));}
    public boolean éPrimo() {
        if (this.numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.numero); i++) {
            if (this.numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

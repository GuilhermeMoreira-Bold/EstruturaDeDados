import javax.swing.*;

import static java.lang.Math.log;

public class Log {
    int logaritmo;
    int logaritmando;
    void ler_num1(){
        this.logaritmo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero logaritmo: "));}
    void ler_num2(){
        this.logaritmando = Integer.parseInt(JOptionPane.showInputDialog("Entre com o logaritmando: "));}
    public double calculo(){
        double i = log(logaritmo) / log(logaritmando);
        return i;
    }

}

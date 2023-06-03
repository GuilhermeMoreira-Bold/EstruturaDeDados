import javax.swing.*;

public class Converter {
    double graus;
    double resultado;

    void ler_graus(){
        this.graus = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos graus será convertido "));
    }
    void ler_rad(){
        this.graus = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos radianos serão convertidos"));
    }
    void conversaoRad(){
        this.resultado = (this.graus * 3.14) / 180;
    }
    void conversaoGraus(){
        this.resultado = (this.graus * 180) / 3.13;
    }
    void imprimir(){
        System.out.println(JOptionPane.showInputDialog(this.resultado));
    }
}

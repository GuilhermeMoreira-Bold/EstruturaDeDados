import javax.swing.*;

public class Media {
    double fator1;
    double fator2;
    double fator3;
    double resultado;

    void ler_fator1(){
        this.fator1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 1: "));
    }
    void ler_fator2(){
        this.fator2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 2: "));
    }
    void ler_fator3(){
        this.fator3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 3: "));
    }
    void media(){
        this.resultado = (this.fator1 + this.fator2 + this.fator3)/3;
    }
    void imprimir(){
        System.out.println("Media aritmetica "+this.resultado);
    }

}

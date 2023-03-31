import javax.swing.*;

public class Dobra {
    int fator1;
    int resultado;

    void ler_fator1(){
        this.fator1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 1: "));
    }
    void dobra(){this.resultado = this.fator1 * this.fator1;}
    void resultado(int valor){
        this.resultado = valor;
    }
    void imprimir(){
        System.out.println("O valor do resultado é: " + this.resultado);
    }
}

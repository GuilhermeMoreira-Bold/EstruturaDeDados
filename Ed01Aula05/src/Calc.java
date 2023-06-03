import javax.swing.*;

public class Calc {
    double fator1;
    double fator2;
    double resultado;

    //metodos
    void ler_fator1(){
        this.fator1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 1: "));
    }
    void ler_fator2(){
        this.fator2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fator 2: "));
    }
    double soma(double a, double b){
        return(a + b);
    }
    double sub(double a, double b){
        return(a - b);
    }
    double mult(double a, double b){
        return(a * b);
    }
    double div(double a, double b){
        return(a / b);
    }
    double quad(double a){
        return(a * a);
    }
    double sqrt(double a){
        return(a * 0.2);
    }
    void resultado(double valor){
        this.resultado = valor;
    }
    void imprimir(){
        System.out.println("O valor do resultado é: " + this.resultado);
    }
}

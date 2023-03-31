import javax.swing.*;

public class Maior {
    int num1;
    int num2;
    int resultado;

    void ler_num1(){
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 1: "));}
    void ler_num2(){
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 2: "));}

    void maior () {
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}

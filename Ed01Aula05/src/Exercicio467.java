import javax.swing.*;
import java.util.Scanner;

public class Exercicio467 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Log loga = new Log();
        for(int c = 0; c <= 3; c++){
            System.out.println("Digite logaritmando maior que zero: ");
            loga.ler_num1();
            while(loga.logaritmo <= 0 ){
                System.out.println("Invalido, digite logaritmando maior que zero");
                loga.ler_num1();
            }
            System.out.println("Digite a base maior que zero e diferente de um: ");
            loga.ler_num2();
            while(loga.logaritmando < 0 || loga.logaritmando ==1){
                System.out.println("Invalido, digite base maior que zero e difernete de um: ");
                loga.ler_num2();
            }
            System.out.println(JOptionPane.showInputDialog("O resultado é: " + loga.calculo()));
        }
    }

}

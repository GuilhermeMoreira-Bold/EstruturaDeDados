import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.util.Scanner;

public class Exercicio473 {
    public static void main(String[] args) {
        Math2 palavra = new Math2();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a letra que será lida: ");
        String c = input.next();
        char c2 = c.charAt(0);
        palavra.ler_palavra(c2);
        if(palavra.verificaConsoante() == 0){
        System.out.println(JOptionPane.showInputDialog("É consoante!"));
        }else{System.out.println("É vogal");}

    }
}

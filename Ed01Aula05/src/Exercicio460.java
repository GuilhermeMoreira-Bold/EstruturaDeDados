import java.util.Scanner;

public class Exercicio460 {
    public static void main(String[] args) {

       Dobra dobrando = new Dobra();
        for(int x = 0; x < 3; x++ ){
            System.out.println("Digite o número que será dobrado");
            dobrando.ler_fator1();
            dobrando.dobra();
            dobrando.imprimir();

        }
    }
}

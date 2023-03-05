import java.util.Scanner;

public class Exercicio351 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[5];
        int numero;
        for(int x = 0; x <= 4; x ++){
            System.out.println("Digite " + (x + 1) + " º nome:" );
            nomes[x] = input.next();
        }

        for(int y = 0; y <= 4; y ++){
            System.out.println("nome " + (y + 1) + ":" + nomes[y] );
        }
        System.out.println("Digite o número da pessoa: ");
        numero = input.nextInt();
        System.out.println(nomes[numero -1]);
    }
}

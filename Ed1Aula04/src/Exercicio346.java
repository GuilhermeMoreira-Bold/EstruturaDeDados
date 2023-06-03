import java.util.Scanner;

public class Exercicio346 {
    public static void main(String[] args) {
        String frase;
        int op, x = 2;
        Scanner input = new Scanner(System.in);

            while (x == 2){
                System.out.println("Menu");
                System.out.println("1 - Imprime o comprimento da frase");
                System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase ");
                System.out.println("3-Imprime a frase espelhada");
                System.out.println("4- Termina o algoritmo");
                System.out.println("OPCAO");
                op = input.nextInt();
                if(op == 1){
                    System.out.println("Digite a frase: ");
                    frase = input.next();
                    System.out.println("Numero de caracteres da frase: "+ frase.length());
                }
                if(op == 2){
                    System.out.println("Digite a frase");
                    frase = input.next();
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0,2));
                    System.out.println("Os dois ultimos caracteres são: " + frase.substring(frase.length() - 2));
                }
                if(op == 3){
                    System.out.println("Digite uma frase: ");
                    frase = input.next();
                    String invertida = "";
                    for(int y = frase.length() -1; y >= 0  ; y--){
                        invertida += frase.charAt(y);
                    }
                    System.out.println("A frase espelhada é: " + invertida);
                }
                if(op == 4){
                 System.out.println("Encerrando o programa...");
                    x = 1;
                }
            }
    }
}

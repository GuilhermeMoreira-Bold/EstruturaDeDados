import java.util.Scanner;

public class Exercicio356 {
    public static void main(String[] args) {
        String nomes[] = new String[15];
        String sit[] = new String[15];
        int media[] = new int[15];
        int pr1[] = new int[15];
        int pr2[] = new int[15];
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < 15; x++) {
            System.out.println("Digite o nome do " + (x + 1) + "º aluno:");
            nomes[x] = input.next();
            System.out.println("Digite a 1ª nota do aluno " + nomes[x] + ":");
            pr1[x] = input.nextInt();
            System.out.println("Digite a 2ª nota do aluno " + nomes[x] + ":");
            pr2[x] = input.nextInt();
            media[x] = (pr1[x] + pr2[x]) / 2;
            if(media[x] > 6) {
                sit[x] = nomes[x] + ": aprovado";
            } else {
                sit[x] = nomes[x] + ": reprovado";
            }
        }
        for(int y = 0; y < 15; y++){
            System.out.println("Aluno: " + sit[y]);
        }
    }
}

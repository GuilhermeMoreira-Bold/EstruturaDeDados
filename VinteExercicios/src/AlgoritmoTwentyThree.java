import java.util.Scanner;

public class AlgoritmoTwentyThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de três casas: ");
        int valor = input.nextInt();
        float div = (valor % 100) /10;
        System.out.println(div);
    }
}

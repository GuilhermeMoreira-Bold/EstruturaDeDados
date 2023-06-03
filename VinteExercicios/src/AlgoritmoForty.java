import java.util.Scanner;

public class AlgoritmoForty {
    public static void main(String[] args) {
        int resto, val1, val2;
        float quoc;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do dividendo");
        val1 = input.nextInt();
        System.out.println("Entre com o divisor");
        val2 = input.nextInt();
        quoc = val1 / val2;
        resto = val1 % val2;
        System.out.println("Dividendo = " + val1 + "\n Divisor = " + val2 + "\n Quociente = " + quoc + "\n Resto = " + resto );
    }
}

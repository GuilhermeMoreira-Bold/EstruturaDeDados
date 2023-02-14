import java.util.Scanner;

public class AlgoritmoFortySix {
    public static void main(String[] args) {
        float saldo, nSaldo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        saldo = input.nextFloat();
        nSaldo = saldo * 1.01f;
        System.out.println("Novo saldo: " + nSaldo);
    }
}

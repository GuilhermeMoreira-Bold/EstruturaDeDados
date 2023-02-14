import java.util.Scanner;

public class AlgoritmoFortyFour {
    public static void main(String[] args) {
        double num, base, logaritmo;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o logaritmando: ");
        num = input.nextDouble();
        System.out.println("Entre com a base que deseja fazer o calculo: ");
        base = input.nextDouble();
        logaritmo = Math.log(num) / Math.log(base);
        System.out.println("Logaritmo: " +  logaritmo);
    }
}

import java.util.Scanner;

public class AlgoritmoFortyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, mp;
        System.out.println("Entre com o numero 1: ");
        a = input.nextInt();
        System.out.println("Entre com o numero 2: ");
        b = input.nextInt();
        System.out.println("Entre com o numero3 : ");
        c = input.nextInt();
        System.out.println("Entre com o numero 4: ");
        d = input.nextInt();
        mp = (a * 1 + b * 2 + c * 3 + d * 4);
        System.out.println(mp);
    }
}

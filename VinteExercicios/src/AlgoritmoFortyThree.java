import java.util.Scanner;

public class AlgoritmoFortyThree {
    public static void main(String[] args) {
        double log, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o logaritmando");
        num = input.nextDouble();
        log = Math.log(num) / Math.log(10);
        System.out.println("Logaritmo: " + log);
    }
}

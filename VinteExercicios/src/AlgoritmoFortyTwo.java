import java.util.Scanner;


public class AlgoritmoFortyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ang, rang;
        System.out.println("Digite o angulo em graus");
        ang = input.nextFloat();
        rang = ang * 3.14f / 180;
        System.out.println("\n Seno " + Math.sin(rang) + "\nCo-seno " + Math.cos(rang) + "\n Tangente " + Math.tan(rang) + "\n Co-secante" + 1 / Math.sin(rang) + "\n Secante " + 1 / Math.cos(rang) + "\n Cotangente " + 1 / Math.tan(rang));
    }
}

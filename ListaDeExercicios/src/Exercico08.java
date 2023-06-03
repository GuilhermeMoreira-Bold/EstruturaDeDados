import java.util.Random;

public class Exercico08 {
    public static void main(String[] args) {
        TestaP teste = new TestaP();
        Random rand = new Random();

        for(int i=0; i<1000; i++) {
            int numeros = rand.nextInt(201) -100;
            teste.testaP(numeros);
        }
    }
}

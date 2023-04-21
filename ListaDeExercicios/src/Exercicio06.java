import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Random rand = new Random();
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
 
        for(int i=0; i<1000; i++) {
            int positivos = rand.nextInt(100);
            fila.enqueue(positivos);
        }
        for(int i=0; i<1000; i++) {
            int negativos = rand.nextInt(100) * -1;
            fila.enqueue(negativos);
        }
        while(fila.size() !=0 ){
            int filaNum = (int) fila.dequeue();
            if(Math.signum(filaNum) == 1){
                pilha.push(filaNum);
            }else if(Math.signum(filaNum) == -1){
                if(pilha.length() == 0){
                    break;
                }
                System.out.println("O número é: " + pilha.pop());
            }
        }
    }
}

import java.util.Random;

public class Exercico07 {
    public static void main(String[] args) {
        Random rand = new Random();
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
 
        for(int i=0; i<20; i++) {
            int positivos = rand.nextInt(100);
            fila.enqueue(positivos);
            System.out.println("Fila não invertida: " + positivos);
        }
        while(fila.size() !=0){
            pilha.push((int)fila.dequeue());
        }
        while(pilha.length()!=0){
            fila.enqueue(pilha.pop());
        }
        while(fila.size() !=0){
            System.out.println("Fila invertida: " + fila.dequeue());
        }
    }
}

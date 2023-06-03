import java.util.Random;
public class Exercicio05 {
    public static void main(String[] args) {
        Fila filaF = new Fila();
        Fila filaAux = new Fila();
        Pilha pilhaP = new Pilha();
        Random gerador = new Random();
        
        for(int i = 0; i < 100; i++){
            int numeroAleatorio = gerador.nextInt(100);
            if(filaF.size() == 0){
                filaF.enqueue(numeroAleatorio);
            }else{
                while(filaF.size() != 0){
                    int numerdoDaFila = (int) filaF.dequeue();
                    filaAux.enqueue(numerdoDaFila);
                    if(numerdoDaFila == numeroAleatorio){
                        pilhaP.push(numeroAleatorio);
                        while(filaAux.size() != 0){
                            filaF.enqueue(filaAux.dequeue());
                        }
                        break;
                    }else if(filaF.size() == 0){
                        filaF.enqueue(numeroAleatorio);
                    }
                }
            }
        }
        while(filaAux.size() != 0){
            filaF.enqueue(filaF.dequeue());
        }

        while(filaF.size() != 0){
            System.out.println("Elemento da fila:  "+filaF.dequeue());
        }
        while(pilhaP.length() !=0 ){
            System.out.println("Elemento da pilha: "  + pilhaP.pop());
        }

    }
}

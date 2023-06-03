public class Exercico04 {
    public static void main(String[] args) {
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();
        Pilha pilha = new Pilha();
        fila1.enqueue(1);
        fila1.enqueue(2);
        fila1.enqueue(3);
        fila1.enqueue(4);
        while(fila1.size() != 0){
            pilha.push((int)fila1.dequeue());
        }
        while(pilha.length != 0){
            fila2.enqueue(pilha.pop());
        }
        while(fila2.size() != 0){
            System.out.println("O valor agora é: "+fila2.dequeue());
        }


    }
}

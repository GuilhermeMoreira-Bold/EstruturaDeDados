import java.util.LinkedList;
public class Fila {

        private LinkedList<Object> lista = new LinkedList<Object>();
    
        // Adicionar um elemento ao final da fila
        public void enqueue(Object elemento) {
            lista.addLast(elemento);
        }
    
        // Remover e retornar o elemento do início da fila
        public Object dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Fila vazia");
            }
            return lista.removeFirst();
        }
        public Object aguardando(){
            return lista.size();
        }
    
        // Verificar se a fila está vazia
        public boolean isEmpty() {
            return lista.isEmpty();
        }
    
        // Obter o tamanho da fila
        public int size() {
            return lista.size();
        }
        public Object mostrar(){
            return lista;
        }
}

public class Pilha {
    int topoPilha = 0;
    int pilha [] = new int[1000];
    int length = 0;

    void push(int num) {
        if(topoPilha > 999){
            System.out.println("Pilha cheia");
        }else{
            pilha[topoPilha] = num;
            length = length + 1;
            topoPilha++;
        }
    }
    int pop() {
      if(topoPilha < 0){
        System.out.println("Pilha vazia");
      }
        length =length - 1;
        return pilha[--topoPilha];
    }

    public int elementoDoTopo(){
        return pilha[topoPilha];} 


    public int length() {
        return length;
    }
}

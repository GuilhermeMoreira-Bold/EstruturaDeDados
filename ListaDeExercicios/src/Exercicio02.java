import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        String entrada = JOptionPane.showInputDialog("Digite uma enrtrada com números, utilizando espaço: ");
        String remover = JOptionPane.showInputDialog("Digite o número que deseja remover: ");
        String entradaSplit[] = entrada.split(" ");
        Pilha pilha = new Pilha();
        Pilha pilha2 = new Pilha();

        for (int i = entradaSplit.length -1; i >=0 ; i--) {
            pilha.push(Integer.parseInt(entradaSplit[i]));
        } 

        while(pilha.topoPilha != 0){
            int item = pilha.pop();
            if(item != (Integer.parseInt(remover))){
                pilha2.push(item);
            }else{
                System.out.println("Item removido: " + item);
            }
        }
        while(pilha2.topoPilha != 0){ System.out.println(pilha2.pop());}
}
}

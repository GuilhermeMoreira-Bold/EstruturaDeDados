import java.util.concurrent.ForkJoinPool;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args){
        
        Fila fila = new Fila();
        Fila filaEspera = new Fila();  
        boolean sair = false;  
        while(sair !=true){
            String escolha = JOptionPane.showInputDialog("Escolha uma das opções: \n1- Criar um avião\n2- Listar número de aviões aguardando na fila\n3-Autorizar a decolagem do primeiro avião da fila\n4-Adicionar um avião à fila de espera\n5-Listar todos os aviões na fila de espera\n6-Listar as características do primeiro avião da fila.\n6-Sair");
            if((Integer.parseInt(escolha) == 1)){
                String nome = JOptionPane.showInputDialog("Digite o nome do avião");
                String numero = JOptionPane.showInputDialog("Digite o numero do avião");
                Aviao aviao = new Aviao(nome, Integer.parseInt(numero));
                fila.enqueue(aviao);
            }else if((Integer.parseInt(escolha) == 2)){
               System.out.println("A quantidade de aviões na fila é de: " + fila.size());
            }else if((Integer.parseInt(escolha) == 6)){
                sair = true;
            }else if((Integer.parseInt(escolha) == 3)){
                fila.dequeue();
            }else if((Integer.parseInt(escolha) == 4)){
                filaEspera.enqueue(fila.dequeue());
            }else if((Integer.parseInt(escolha) == 5)){
                System.out.println(filaEspera.mostrar());
            }
        }
     






    }
}

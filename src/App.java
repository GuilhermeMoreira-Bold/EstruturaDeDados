import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       Random random = new Random();
       PilhaDinacima<Integer> pilha1 = new PilhaDinacima<>();
       PilhaDinacima<Integer>  pilha2 = new PilhaDinacima<>(); 
       PilhaDinacima<Integer>  pilha3 = new PilhaDinacima<> (); 

       for(int i = 0; i < 100; i++) {
        int numero = random.nextInt(8) + 1;
        if(numero < 4){
            pilha1.push(numero);
        }else if(numero < 7){
            pilha2.push(numero);
        }else{
            pilha3.push(numero);
        }
       }
       
       int lengthFor = 0;
       for(int i = 0; i < 100; i++) {
            int numero = random.nextInt(2) + 1;
   
            if(!pilha1.isEmpyt() && !pilha2.isEmpyt() && !pilha3.isEmpyt()){
                if(numero == 1){
                    int numero1 = pilha2.pop().getDado();
                    int numero2 = pilha3.pop().getDado();
                    pilha1.push(numero1);
                    pilha1.push(numero2);
                    System.out.println("Empilhando os numeros: " +"[" +numero1 + " " + numero2 +"]" +" na pilha 1");
                }else if(numero == 2){
                    int numero1 = pilha1.pop().getDado();
                    int numero2 = pilha3.pop().getDado();
                    pilha2.push(numero1);
                    pilha2.push(numero2);
                    System.out.println("Empilhando os numeros: " + "[" + numero1 + " " + numero2 +"]" + " na pilha 2");
                }else if(numero == 3){
                    int numero1 = pilha1.pop().getDado();
                    int numero2 = pilha2.pop().getDado();
                    pilha3.push(numero1);
                    pilha3.push(numero2);
                    System.out.println("Empilhando os numeros: " + "[" + numero1 + " " + numero2 +"]" + " na pilha 3");
                }
            }else{
                System.out.println("O programa foi encerrado porque uma das pilhas está vazia " +"\n" +"Pilha 1: "+"[" +pilha1.imprimir() + "]" +"\n" + "Pilha 2: "+"[" + pilha2.imprimir() + "]" + "\n" +"Pilha 3: "+"[" + pilha3.imprimir() + "]");
                i = 101;
                break;
            }  
            lengthFor++;
       }
       if(lengthFor == 100){
        System.out.println("O programa foi encerrado porque os 100 numeros foram sorteados" + "\n" + pilha1.imprimir() + "\n" + pilha2.imprimir() + "\n" + pilha3.imprimir());
       }
    }
}

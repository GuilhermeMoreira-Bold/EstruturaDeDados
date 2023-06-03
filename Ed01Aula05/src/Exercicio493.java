public class Exercicio493 {
    public static void main(String[] args) {
        Math2 ordem = new Math2();
        ordem.adcionarVetor1();
        if(ordem.vetorOrdenado() == 2){
            System.out.println("Vetor em ordem crescente!");
        } else if (ordem.vetorOrdenado() == 1) {
            System.out.println("Vetor em ordem decrescente!");
        }else if(ordem.vetorOrdenado() == 0 ){
            System.out.println("Vetor desordenado!");
        }
    }
}

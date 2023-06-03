public class Exercicio02 {
    public static void main(String[] args) {
        ListaDuplaNo lista1 = new ListaDuplaNo();
        lista1.AdicionaNoComeco("2"); 
        lista1.AdicionaNoComeco("3");
        System.out.println(lista1.Imprimir());
        lista1.RemovedoComeco();
        lista1.RemovedoComeco();
        System.out.println(lista1.Imprimir());
    }
}

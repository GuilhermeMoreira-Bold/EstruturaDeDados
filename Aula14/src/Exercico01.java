public class Exercico01 {
    public static void main(String[] args) throws Exception {
        ListaDupla lista1 = new ListaDupla();
        ListaDupla lista2 = new ListaDupla();

        // lista1.Adiciona("Primeiro");
        // lista2.Adiciona("Segundo");
        // lista2.Adiciona("Terceiro");
        // lista1.concatenaLista(lista1, lista2);
        // System.out.println(lista1.Imprimir());

      //  Letra B Dividir uma lista em duas:

        // lista1.Adiciona("Primeiro");
        // lista1.Adiciona("Segundo");
        // lista1.Adiciona("Terceiro");
        // lista1.Adiciona("Quarto");
        // lista1.Adiciona("Quinto");

        // lista1.separarLista(lista1);
        // System.out.println(lista1.listaDividida1().Imprimir());
        // System.out.println(lista1.listaDividida2().Imprimir());

        // Letra C intercalar duas listas ordenadas
        
        lista1.Adiciona("Primeiro");
        lista1.Adiciona("Terceiro");
        lista2.Adiciona("Segundo");
        lista2.Adiciona("Quarto");
        lista1.Adiciona("Quinto");
        lista1.intercalarDupla(lista1, lista2);
        System.out.println(lista1.listaOrdenada().Imprimir());
    }
}

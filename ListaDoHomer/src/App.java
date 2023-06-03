import java.util.MissingFormatArgumentException;

public class App {
    public static void main(String[] args) throws Exception {
        ListaDupla lista = new ListaDupla();
        lista.Adiciona("Homer");
        lista.Adiciona("Marge");
        System.out.println(lista.Imprimir());
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.Imprimir());

        lista.Adiciona("Homer");
        System.out.println(lista.Imprimir());
        lista.Adiciona(0,"Bart");
        System.out.println(lista.Imprimir());
        lista.Adiciona(1,"Moll");
        System.out.println(lista.Imprimir());

        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());

        System.out.println(lista.Imprimir());

        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        lista.Adiciona(0, "Lisa");
        System.out.println(lista.Imprimir());
        System.out.println(lista.TotaldeElementos);

        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.Imprimir());

        
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        System.out.println(lista.RemovedoComeco());
        System.out.println(lista.RemovedoComeco());
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        lista.Adiciona("Marge");
        lista.Adiciona(1, "Magie");
        lista.Adiciona(0, "Ned Flanders");
        lista.Adiciona( "Sr.Burns");
        System.out.println(lista.Imprimir());
        lista.RemovedoFim();
        System.out.println(lista.Imprimir());
        for(int i=0; i<lista.TotaldeElementos; i++) {
        if(lista.Contem("Marge") == true || lista.Contem("Homer"  ) == true || lista.Contem("Bart"  ) == true || lista.Contem("Maggie"  ) == true){
            System.out.println(lista.Imprimir());
            System.out.println(lista.TotaldeElementos);
        }else{
            System.out.println("Deu ruim");
        }
        lista.RemovedoComeco();
        System.out.println(lista.Imprimir());
        System.out.println(lista.TotaldeElementos);
        if(lista.Contem("Marge") == true || lista.Contem("Homer"  ) == true || lista.Contem("Bart"  ) == true || lista.Contem("Maggie"  ) == true){
            System.out.println(lista.Imprimir());
            System.out.println(lista.TotaldeElementos);
        }else{
            System.out.println("Deu ruim");
        }
        lista.RemovedoComeco();
        lista.RemovedoComeco();
        lista.RemovedoComeco();
        lista.RemovedoComeco();
        lista.Imprimir();
        }
    
    }
}

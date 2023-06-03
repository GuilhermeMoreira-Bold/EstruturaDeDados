import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        // Pessoa p1 = new Pessoa("Guilherme", "64-99999", "Rua Simão");
        // Pessoa p2 = new Pessoa("João", "64-88888", "Avenida dos Sonhos");
        // Pessoa p3 = new Pessoa("Maria", "64-77777", "Praça da Liberdade");
        // Pessoa p4 = new Pessoa("Carlos", "64-66666", "Rua das Flores");
        // Pessoa p5 = new Pessoa("Ana", "64-55555", "Avenida dos Anjos");
        // Pessoa p6 = new Pessoa("Pedro", "64-44444", "Rua das Palmeiras");
        // Pessoa p7 = new Pessoa("Mariana", "64-33333", "Avenida Central");
        // Pessoa p8 = new Pessoa("Lucas", "64-22222", "Rua do Sol");
        // Pessoa p9 = new Pessoa("Isabela", "64-11111", "Praça das Estrelas");
        // Pessoa p10 = new Pessoa("Rafael", "64-00000", "Avenida das Montanhas");
        // Pessoa p11 = new Pessoa("Juliana", "64-77777", "Rua do Mar");
        // Pessoa p12 = new Pessoa("Eduardo", "64-55555", "Avenida dos Ventos");
        // Pessoa p13 = new Pessoa("Fernanda", "64-33333", "Rua do Lago");
        // Pessoa p14 = new Pessoa("Marcelo", "64-11111", "Avenida das Árvores");
        // Pessoa p15 = new Pessoa("Patrícia", "64-88888", "Rua das Nuvens");
        // Pessoa p16 = new Pessoa("Gustavo", "64-66666", "Praça dos Sonhos");
        // Pessoa p17 = new Pessoa("Laura", "64-44444", "Avenida dos Pássaros");
        // Pessoa p18 = new Pessoa("Rodrigo", "64-22222", "Rua da Montanha");
        // Pessoa p19 = new Pessoa("Camila", "64-99999", "Avenida das Flores");
        // Pessoa p20 = new Pessoa("Victor", "64-77777", "Praça do Sol");
        ListaLigada lista = new ListaLigada();
        Random rand = new Random();
        for (int i = 1; i <= 20; i++) {
            Pessoa pessoa = new Pessoa("Nome" + i, "Telefone" + i, "Endereço" + i);
            lista.adiciona(pessoa);
        }
        while(lista.totalDeElementos > 2){
            int index = rand.nextInt(lista.totalDeElementos);
            System.out.println(index +" "+lista.removeByIndex(index).toString());
        }
        System.out.println("O ultimo a ser removido é: "+lista.removeByIndex(0).toString());
    }
}
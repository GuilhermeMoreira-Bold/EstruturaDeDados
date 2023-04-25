public class Pessoa {
    String nome;
    String telefone;
    String endereco;
    String cpf;

    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return this.nome + " " + this.telefone + " " + this.endereco;
    }
}

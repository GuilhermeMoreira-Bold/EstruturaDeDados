import java.util.Random;
public class Pessoa{
    private int id;
    private String sexo;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;
    private int idade;

    public Pessoa(int id, String sexo, boolean gestante, boolean necessidadeEspecial, boolean lactante, int idade){
        this.id = id;
        this.sexo = sexo;
        this.gestante = gestante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.lactante = lactante;
        this.idade = idade;
    }
    public static Pessoa gerarPessoasAleatoria(){
        Random rand = new Random();
        int id = rand.nextInt(1000);
        String sexo = rand.nextBoolean() ? "M" : "F";
        boolean gestante = rand.nextBoolean();
        boolean lactante;
        if(gestante == false){
            lactante = rand.nextBoolean();
        }else{
            lactante = false;
        }
        boolean necessidadeEspecial = rand.nextBoolean();
        int idade = rand.nextInt(0, 100);
        return new Pessoa(id, sexo, gestante, necessidadeEspecial, lactante, idade);
    }

    public int getId() {
        return this.id;
    }


    public String getSexo() {
        return this.sexo;
    }

    public boolean isGestante() {
        return this.gestante;
    }

    public boolean getGestante() {
        return this.gestante;
    }

    public boolean isLactante() {
        return this.lactante;
    }

    public boolean getLactante() {
        return this.lactante;
    }

    public boolean isNecessidadeEspecial() {
        return this.necessidadeEspecial;
    }

    public boolean getNecessidadeEspecial() {
        return this.necessidadeEspecial;
    } 

    public int getIdade() {
        return idade;
    }
    @Override
    public String toString() {
        return "{" +
            " \n id='" + getId() + "'" +
            ", \n sexo='" + getSexo() + "'" +
            ", \n gestante='" + isGestante() + "'" +
            ", \n lactante='" + isLactante() + "'" +
            ", \n necessidadeEspecial='" + isNecessidadeEspecial() + "'" +
            ", \n idade='" + idade + "'" +
            "\n }";
    }

}
   
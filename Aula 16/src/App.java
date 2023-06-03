public class App {
    public static void main(String[] args) throws Exception {
        int quantidadeDePessoasAtendidas = 0;
        int vezesQueAtendeu = 0;
        Deque<Pessoa> atendidas = new Deque<Pessoa>();
        Deque<Pessoa> naoAtendidas = new Deque<Pessoa>();

      while(quantidadeDePessoasAtendidas < 100) {
        Deque<Pessoa> grupo = new Deque<Pessoa>();
        for(int i = 0; i < 10; i ++ ){
            Pessoa pessoa = Pessoa.gerarPessoasAleatoria();
            if(pessoa.getGestante() || pessoa.getLactante() || pessoa.getIdade() > 60 || pessoa.getNecessidadeEspecial()){
                grupo.adicionaNoInicio(pessoa);
            }else{
                grupo.adicionaNoFinal(pessoa);
            }  
        }
        if(vezesQueAtendeu < 10){
            for(int i = 0; i < vezesQueAtendeu; i++){
                atendidas.adicionaNoInicio(grupo.removeDoInicio());
                quantidadeDePessoasAtendidas ++;
            }
            if(!grupo.isEmpty()){
                for(int i = 0; i < grupo.size(); i++){
                    naoAtendidas.adicionaNoInicio(grupo.removeDoInicio());
                }
            }
            vezesQueAtendeu++;
        }else{
            for(int j = 0; j < grupo.size(); j++){
                if(quantidadeDePessoasAtendidas != 100){
                    atendidas.adicionaNoInicio(grupo.removeDoInicio());
                    quantidadeDePessoasAtendidas ++;
                }
                else{
                    break;
                }
            }
            if(!grupo.isEmpty()){
                for(int i = 0; i < grupo.size(); i++){
                    naoAtendidas.adicionaNoInicio(grupo.removeDoInicio());
                }
            }
        }
      }
      System.out.println("Pessoas não atendidas: " + naoAtendidas.toString());
    }
}

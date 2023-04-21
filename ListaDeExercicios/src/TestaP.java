public class TestaP {
    Pilha P = new Pilha();
    Pilha N = new Pilha();
    public void testaP(int numero){
        if(Math.signum(numero) == 1){
            P.push(numero);
        }else if(Math.signum(numero) == -1){
            N.push(numero);
        }else if(Math.signum(numero) == 0){
            System.out.println("Número P retirado: " + P.pop());
            System.out.println("Numero N retiado: " + N.pop());
        }   
    }
    
}

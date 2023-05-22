public class PilhaDinamica {
    private CelulaPilha top;
    public int length;

    public void push(String nome){
        CelulaPilha novaCelula = new CelulaPilha();
        novaCelula.setDado(nome);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
        this.length ++;
    }

    public CelulaPilha pop(){
    if(!isEmpyt()){
        CelulaPilha aux = this.top;
        this.top = this.top.getAnterior();     
        this.length --;                                                                            
        return aux;
    }else{
        throw new IllegalStateException ("Pilha Vazia!!!");  
    } 
    
}    
    public boolean isEmpyt(){
            return this.length == 0 || this.top == null;
    }

    public int sizePilha(){
        CelulaPilha p; int cont = 0;
        p = this.top;
        while(p != null){
        p = p.getAnterior();
        cont++;
        }
        return cont; }

    public void imprimir(){
        CelulaPilha p; p = this.top;
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        }else{
        while(p != null){
        System.out.println("Nome na pilha..: "+p.getDado());
        p = p.getAnterior();
        }
     }     
    }
    public CelulaPilha top(){
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        return null;
        }else {
        return this.top;
    } 
}

    public CelulaPilha peek(){
        return this.top;
    }
} 


public class PilhaDinacima<T> {
    private CelulaPilha<T> top;
    public int length;

    public void push(T dado){
        CelulaPilha<T> novaCelula = new CelulaPilha<>();
        novaCelula.setDado(dado);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
        this.length ++;
    }

    public CelulaPilha<T> pop(){
    if(!isEmpyt()){
        CelulaPilha<T> aux = this.top;
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
        CelulaPilha<T> p; int cont = 0;
        p = this.top;
        while(p != null){
        p = p.getAnterior();
        cont++;
        }
        return cont; }

    public String imprimir(){
        CelulaPilha<T> p; p = this.top;
        String pilha = "";
        if(isEmpyt()){
        pilha = "Pilha Vazia!!!";
        return pilha;
        }else{
        while(p != null){
            pilha  += " "+p.getDado() + ",";         
            p = p.getAnterior();
            
        }
        return pilha;
     }     
    }
    public CelulaPilha<T> top(){
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        return null;
        }else {
        return this.top;
    } 
}

    public CelulaPilha<T> peek(){
        return this.top;
    }
}

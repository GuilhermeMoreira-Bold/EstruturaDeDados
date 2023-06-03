public class ListaLigada {
    Celula primeira;
    Celula ultima;
    int totalDeElementos = 0;
    
    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(this.primeira,elemento);
        this.primeira = nova;
        
        if(this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        
        this.totalDeElementos++;
    }
    public Celula getPrimeira() {
        return primeira;
    }
    
    public void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
    public boolean posicaoOcupada(int pos){
        return((pos>=0)&&(pos < this.totalDeElementos));
    }
    
    public Celula PegaCelula(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posicao nao Existe!!!");
        }else{
            Celula atual = this.primeira;
            for(int i=0; i< pos; i++){
                atual = atual.getProxima();
            }
            
            return(atual);
        }
    }
    
    public void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.adicionaNoComeco(elemento);
        }else{ if(pos == this.totalDeElementos){
                   this.adiciona(elemento);
              }else{
                    Celula anterior = this.PegaCelula(pos-1);
                    Celula nova = new Celula(anterior.getProxima(),elemento);
                    anterior.setProxima(nova);
                    this.totalDeElementos++;
              }
        }
    }
    public Celula removeByIndex(int posicao){
            Celula atual = this.primeira;
            Celula anterior = null;
            for(int i = 0; i < posicao; i++) {
            anterior = atual;
            atual = atual.getProxima();
        }

     if(anterior == null){
        this.primeira = atual.getProxima();
        } else {
        anterior.setProxima(atual.getProxima());
        }

        this.totalDeElementos--;
        return atual;
    //         for(int i=0; i < posicao; i++){
    //             if(posicao == totalDeElementos){
    //                 atual.setProxima(this.primeira);
    //             }else{
    //                 atual = atual.getProxima();
    //             }
    //         }
    //         atual.setProxima(atual.getProxima());
    //         this.totalDeElementos--;
    //         return atual;
    // }
    // public Object pega(int posicao){
    //     return(this.PegaCelula(posicao).getElemento());
    }
    
    public Celula removeDoComeco(){

        Celula elemento = this.primeira;
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;
            if(this.totalDeElementos == 0){
                this.ultima = null;
            }            
        }

        return elemento;
    }
    
    public boolean Contem(Object elemento){
        Celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            
            atual = atual.getProxima();
        }
        
        return(false);
    }
    
    public int tamanho(){
        return(this.totalDeElementos);
    }
}
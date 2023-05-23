public class CelulaPilha<T> {
    private T nome;
    private CelulaPilha<T> anterior;
    

    public CelulaPilha(){}

    public CelulaPilha(T nome, CelulaPilha<T> anterior){
        this.nome = nome;
        this.anterior = anterior;
    }

    public T getDado(){
        return this.nome;
        }
        
        public void setDado(T nome){
        this.nome = nome;
    }

    public CelulaPilha<T> getAnterior(){
        return(this.anterior);
        }
        
        public void setAnterior(CelulaPilha<T> anterior){
        this.anterior = anterior;
    }
}

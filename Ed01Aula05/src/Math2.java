import javax.swing.*;

public class Math2 {
    int numero1;
    int numero2;
    int numero3;
    int numero4;

    char letra;

    int vetor1 [] = new int[4];
    int vetor2 [] = new int[4];
    String vetor3 [] = new String[6];
    String vetor4 [] = new String[6];
    int vetor6[] = new int[6];
    String palavra2;

    void ler_palavra2(){
        this.palavra2 = JOptionPane.showInputDialog("Digite a o caracter para substituir: ") ;
    }

    void ler_num1(){
        this.numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero: "));}
    void ler_num2(){
        this.numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 2: "));}
    void ler_num3(){
        this.numero3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 3: "));}
    void ler_num4(){
        this.numero4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero 4: "));}

    void ler_palavra(char c){
        this.letra = c;}

    public int quantasVezes(){
        int quantidade = 0;
        while (this.numero1 % this.numero2 == 0) {
            quantidade++;
            this.numero1 /= this.numero2;
        }
        return quantidade;
    }
    public void adcionarVetor1(){
        for(int i = 0; i < this.vetor1.length; i++){
            this.vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero" + (i + 1) + ":" ));
        }
    }
    public void adcionarVetor2(){
        for(int i = 0; i < this.vetor2.length; i++){
            this.vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero" + (i + 1) + ":" ));
        }
    }
    public void adcionarVetor6(){
        for(int i = 0; i < this.vetor6.length; i++){
            this.vetor6[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero" + (i + 1) + ":" ));
        }
    }
    public void adcionarVetorString(){
        for(int i = 0; i < this.vetor3.length; i++){
            this.vetor3[i] = JOptionPane.showInputDialog("Entre com o caractere" + (i + 1) + ":" );
        }
    }
    public void ocorrencias(){
        for(int i = 0; i < this.vetor3.length; i++){
            if(this.vetor3[i] == palavra2){
                this.vetor3[i] = "*";
            }
        }
        for(int i = 0; i < this.vetor3.length; i++){
            System.out.println(this.vetor3[i]);
        }
    }
    public int vetorOrdenado(){
       boolean crescente = false;
       boolean decrescente = false;

       for(int i = 0; i < vetor1.length -1; i ++){
           if(vetor1[i] > vetor1[i + 1]){
               crescente = true;
           }else if(vetor1[i] < vetor1[i+1]){
               decrescente = true;
           }
       }
       if(crescente == true){
           return 1;
       } else if (decrescente == true) {
           return 2;
       } else return 0;
    }
    public void vetorOrdernado2(String vet [],int tamanho){
        int L1, c1;
        String aux;
        for(L1 = 0; L1<tamanho -1 ;L1++){
            for(c1=L1+1;c1<tamanho;c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet [L1]; vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
    public void inverterVetor(){

        int tamanho = this.vetor1.length;
        int novoVetor [] = new int[tamanho];
        for(int i=0; i < tamanho; i ++){
            novoVetor[tamanho -1 - i] = vetor1[i];
        }
        for(int i=0; i < tamanho; i ++){
           System.out.println(novoVetor[i]);
        }

    }
    public void imprimirCaracteres(){
        for(int i = 0; i < this.vetor6.length; i++){
            System.out.println("");
            for(int j = 0; j < this.vetor6[i]; j ++){
                System.out.println(vetor3[i]);
            }
        }
    }
    public int prodVetores(){
        int resultado = 0;
        for(int i = 0; i < this.vetor1.length; i++){
            resultado = resultado + (vetor1[i] * vetor2[i]);
        }
        return resultado;
    }

    public int base(){
            int nb, r,b;
            nb = 0;
            b = 0;
            while( this.numero1 >= this.numero2)
            {
                r = this.numero1 % this.numero2;
                nb = nb + 10 ^ b * r;
                this.numero1 = this.numero1 / this.numero2;
                b++;
            }
            nb = nb + 10 ^b * this.numero1;
            return(nb);
    }
    public boolean capiuca(){
        String str = Integer.toString(this.numero1);
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }


    public int verificaConsoante() {
        if (this.letra != 'a' && this.letra != 'e' && this.letra != 'i' && this.letra != 'o' && this.letra != 'u') {
                return 1;}
        else return 0;
    }

}

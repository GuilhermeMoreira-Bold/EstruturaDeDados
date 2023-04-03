import javax.swing.*;
import java.util.Arrays;

public class Pilha {
    String pilha [] = new String[10];
    int topoPilha = -1;
    void imprimir(int topo){
        for(int i = topo; i > 0; i--){
            System.out.println(this.pilha[i]);
        }
    }

    int push(int topo, String frase){
        this.topoPilha = topo;
        this.topoPilha++;
        if(this.topoPilha < 0){
            this.topoPilha = 0;
        }
        if(this.topoPilha > 9){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topoPilha--);
        }else{
            String parts [] = frase.split("");
            String newString = "";
             for(var i = parts.length -1; i >= 0; i --){
                    newString += parts[i];
             }
             String parts2 [] = newString.split(" ");
             String newString2= "";
            for(var i = parts2.length -1; i >= 0; i --){
                newString2 += parts2[i] + " ";
            }

            this.pilha[this.topoPilha]=newString2;
            System.out.println("Inserindo o elemento..: "+newString2);
            return(this.topoPilha);
        }
    }


}

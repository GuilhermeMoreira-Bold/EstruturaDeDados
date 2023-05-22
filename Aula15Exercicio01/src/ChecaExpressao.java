public class ChecaExpressao {
    ExpressaoRegular expressaoRegular = new ExpressaoRegular();
    String regex = "[\\[{(]";
    String regexNum = "\\d+|[+\\-*/]";


    PilhaDinamica pilha = new PilhaDinamica();

    public boolean isCorrect(String expressao){
        String expressaoSplit[] = expressaoRegular.resolver(expressao);
        for(int i = 0; i < expressaoSplit.length; i++){
            if(expressaoSplit[i].matches(regex)){
                pilha.push(expressaoSplit[i]);
            }else if(pilha.length > 0 && !expressaoSplit[i].matches(regexNum)){
                String atual = pilha.pop().getDado();
                if(expressaoSplit[i].equals(")")){
                    if(atual.equals("(")){
                        System.out.println("Dentro");
                    }else{ return false; }
                }else if(expressaoSplit[i].equals("]")){
                    if(atual.equals("[")){
                        System.out.println("Dentro");
                    }else{ return false; }
                }else if(expressaoSplit[i].equals("}")){
                    if(atual.equals("{")){
                        System.out.println("Dentro");
                    }else{ return false; }
                }
            }
        }
        return true && pilha.isEmpyt();
    }
}
// ((7*5)*4-(8/3))
// ((7*5)*4-(8/3)
public class ExpressaoRegular {
    public String[] resolver(String expressao){
        expressao = expressao.replaceAll("\\s+", "").replaceAll("([+\\-*/(){}\\[\\]])", " $1 ").replaceAll("([{}\\[\\]])", " $1 ");

        String[] elementos = expressao.trim().split("\\s+");
        return elementos;
    }

    public String resolverToString(String expressao){
        expressao = expressao.replaceAll("\\s+", "").replaceAll("([+\\-*/()])", " $1 ");
        return expressao;
    }
}

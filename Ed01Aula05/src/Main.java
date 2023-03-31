public class Main {
    public static void main(String[] args) {
        Calc calculadora =  new Calc();
        calculadora.ler_fator1();
        calculadora.ler_fator2();

        calculadora.resultado(calculadora.soma(calculadora.fator1, calculadora.fator2));
        calculadora.imprimir();

        calculadora.resultado(calculadora.sub(calculadora.fator1, calculadora.fator2));
        calculadora.imprimir();

        calculadora.resultado(calculadora.mult(calculadora.fator1, calculadora.fator2));
        calculadora.imprimir();

        calculadora.resultado(calculadora.div(calculadora.fator1, calculadora.fator2));
        calculadora.imprimir();

        calculadora.resultado(calculadora.quad(calculadora.fator1));
        calculadora.imprimir();

        calculadora.resultado(calculadora.sqrt(calculadora.fator1));
        calculadora.imprimir();

    }
}
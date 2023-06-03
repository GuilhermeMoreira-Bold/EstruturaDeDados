public class Exercicio480 {
    public static void main(String[] args) {
        System.out.println("Digite o ano:");
        Math2 capiuca = new Math2();
        capiuca.ler_num1();
        if(capiuca.capiuca()== true){
            System.out.println(capiuca.numero1 + " é capiuca.");
        }else{
            System.out.println(capiuca.numero1 + " não é um ano capiuca.");
        }
    }
}
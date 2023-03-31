public class Exercicio481 {
    public static void main(String[] args) {
    System.out.println("Digite número maior ou igual a zero: ");
    Math2 converter = new Math2();
    converter.ler_num1();
    System.out.println("Digite a base em que deseja converte-lo (2-10): ");
    converter.ler_num2();
    int base = converter.base();
    System.out.println("Número na base: "+ converter.numero2 + " "+ base);
    }
}

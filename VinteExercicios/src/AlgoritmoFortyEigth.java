import java.util.Scanner;

public class AlgoritmoFortyEigth {
    public static void main(String[] args) {
        float salarioMinimo, quantidadeDeQuilowatt, valorPago, valorComDesconto, preco;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor do salário minimo: ");
        salarioMinimo = input.nextFloat();
        System.out.println("Entre com a quantidade de Quilowatts: ");
        quantidadeDeQuilowatt = input.nextFloat();
        preco = quantidadeDeQuilowatt /7 /100;
        valorPago = preco * quantidadeDeQuilowatt;
        valorComDesconto = valorPago * 0.9f;
        System.out.println("Preço do Quilowatt: " + preco + "\n Valor a ser pago: " + valorPago + "\n Valor com desconto: " + valorComDesconto);
    }
}

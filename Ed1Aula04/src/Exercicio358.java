import java.util.Scanner;

public class Exercicio358 {
    public static void main(String[] args) {
;
        int precoCompras[] = new int[100];
        int precoVendas[] = new int[100];
        int lucroMenorQueDez = 0;
        int lucroMenorQue20 = 0;
        int lucroMaiorQue20 = 0;
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < 100; x ++){
            System.out.println("Digite o preço de compra:");
            precoCompras[x] = input.nextInt();
            System.out.println("Digite o preço de venda da mercadoria: ");
            precoVendas[x] = input.nextInt();
            if((precoVendas[x] - precoCompras[x]) * 100 < 10){
                lucroMenorQueDez++;
            } else if ((precoVendas[x] - precoCompras[x]) * 100 <= 20) {
                lucroMenorQue20++;
            }else{
                lucroMaiorQue20 ++;
            }
        }
        System.out.println("total de mercadorias com lucro < 10%: " + lucroMenorQueDez + "\n Total de mercadorias com 10% <= lucro <= 20%: " + lucroMenorQue20 +"\n Lucro maior que 20%: " + lucroMaiorQue20);
    }
}

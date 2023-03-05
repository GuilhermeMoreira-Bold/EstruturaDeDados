import java.util.Scanner;

public class Exercicio360 {
    public static void main(String[] args) {
        String signo[] = {"Capricórnio","Aquário","Peixes","Áries","Touro","Gêmeos","Câncer","Leão","Virgem","Libra","Escoprião","Sargitário"};
        Scanner input = new Scanner(System.in);
        System.out.println("Digite data no formato dd-mm, dia e mês ou 9999 para terminar: ");
        int data = input.nextInt();
        int dia;
        int mes;
        int ultDia[] = {20, 19,20,20,20,20,21,22,22,22,21,21};
        while(data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes --;
            if(dia > ultDia[mes]){
                mes = (mes + 1) %12;
            }
            System.out.println("Signo: " + signo[mes]);
            System.out.println("Digite data no formato dd-mm, dia e mês ou 9999 para terminar: ");
            data = input.nextInt();
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String nomes[] = new String[5];
        float nota1[] = new float[5];
        float nota2[] = new float[5];
        float media[] = new float[5];

        for(int l = 0; l < 5; l++){
            System.out.println("Digite" + (l+1) + "nome:");
            nomes[l] = input.next();
            System.out.println("Digite a primeira nota:");
            nota1[l] = input.nextFloat();
            System.out.println("Digite a segunda nota: ");
            nota2[l] = input.nextFloat();
            media[l] = (nota1[l] + nota2[l])/2;
        }
        for(int a = 0; a < 5; a++){
            System.out.println((a+1)+"- "+nomes[a]);
            System.out.println("Primeira nota:" + nota1[a] +"\n"+"Segunda nota: " + nota2[a] + "\n" + "Media: " + media[a]);
        }


    }
}
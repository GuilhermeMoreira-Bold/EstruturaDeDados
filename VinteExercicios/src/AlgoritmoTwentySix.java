import java.util.Scanner;

public class AlgoritmoTwentySix {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int data, dia, mes, ano, ndata;
                System.out.println("Digite no formato ddmmaa");
                data = input.nextInt();
                dia = data / 10000;
                mes = (data % 10000) / 100;
                ano = data % 100;
                ndata = mes *10000 + dia * 100 + ano;
                System.out.println("Dia: " + dia + " \nMES: " + mes + "\nANO: " + ano + "\nData no formatoMMDDAA: " + ndata);

            }
        }

package Exer4;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
        Data data = new Data();

        int dia = 0, mes = 0, ano = 0;
        String resposta;

        do {
            System.out.println("\n Entre com a data [dia/mes/ano]\n");
            System.out.print(" Dia: ");
            data.setDia(leia.nextInt());
            System.out.print(" Mês: ");
            data.setMes(leia.nextInt());
            System.out.print(" Ano: ");
            data.setAno(leia.nextInt());

            System.out.println(" Data inserida é: " + data.mostraData());
            System.out.print(" A Data é" + (data.dataValida() ? " Valida!" : " Invalida!"));

            System.out.print("\n Inserir Outra Data ? [S/N]: ");
            resposta = leiaStr.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("\n\tFim do programa...\n");
    }
}

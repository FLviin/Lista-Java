package Exer6;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Data datas = new Data();

        System.out.println("\n Entre com as datas [dia/mes/ano]");
        System.out.print(" Data 1:\n");
        System.out.print(" Dia: ");
        datas.setDia(leia.nextInt());
        System.out.print(" Mês: ");
        datas.setMes(leia.nextInt());
        System.out.print(" Ano: ");
        datas.setAno(leia.nextInt());

        System.out.print("\n Data 2:\n");

        System.out.print(" Dia: ");
        datas.setDia2(leia.nextInt());
        System.out.print(" Mês: ");
        datas.setMes2(leia.nextInt());
        System.out.print(" Ano: ");
        datas.setAno2(leia.nextInt());

        System.out.println("\n Primeira Data inserida é: " + datas.mostraData());
        System.out.println(" Data é" + (datas.dataValida() ? " Valida!" : " Invalida!"));

        System.out.println("\n Segunda Data inserida é: " + datas.mostraData2());
        System.out.println(" Data é" + (datas.dataValida2() ? " Valida!" : " Invalida!"));

        System.out.println("\n" + datas.compararData());

        System.out.println("\n Diferença de Dias ==> " + datas.diferencaDias());

        System.out.println("\n\tFim do programa...\n");
    }
}

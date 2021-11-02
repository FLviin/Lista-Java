package Exer7;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ModeloDeComputador computador = new ModeloDeComputador();

        System.out.print("\n" + computador);

        System.out.print("\n\t === Escolha as peças ===\n");

        System.out.print(" Opções de processadores:\n1) 1600Mhz - 2) 1800Mhz - 3) 1900Mhz\n");
        System.out.print(" Escolha: ");
        computador.setProcessador(leia.nextInt());

        System.out.print("\n Opções de Memória RAM:\n1) 1GB - 2) 2GB - 3) 4GB - 4) 6GB - 5) 8GB\n");
        System.out.print(" Escolha: ");
        computador.setRam(leia.nextInt());

        System.out.print("\n Opções de Disco Rígido:\n1) 500GB - 2) 1TB - 3) 2TB\n");
        System.out.print(" Escolha: ");
        computador.setHd(leia.nextInt());

        System.out.print("\n Opções de Monitor:\n1) 15 Polegadas - 2) 17 Polegadas\n");
        System.out.print(" Escolha: ");
        computador.setMonitor(leia.nextInt());

        System.out.println("\n Preço Placa Mãe: " + computador.getPlacaMae() + " R$");
        System.out.println(" Preço Processador: " + computador.getProcessador() + " R$");
        System.out.println(" Preço Memória RAM: " + computador.getRam() + " R$");
        System.out.println(" Preço Disco Rígido: " + computador.getHd() + " R$");
        System.out.println(" Preço Monitor: " + computador.getMonitor() + " R$");

        System.out.println("\n TOTAL: " + computador.calcularPreco() + " R$");

        leia.close();

    }
}

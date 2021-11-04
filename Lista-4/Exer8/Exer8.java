package Exer8;

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double resposta = 0;

        ConversaoDeUnidadeDeArea conversao = new ConversaoDeUnidadeDeArea();

        System.out.println(" === Conversor de Área ===");

        System.out.print("\n Digite um Valor: ");
        resposta = leia.nextDouble();
        conversao.setValorParaConversao(resposta);

        System.out.println("\n == Converção == \n");
        System.out.println(" >> Metros Quadrados = " + resposta + " \n");
        System.out.println(conversao.converterAreaMetros());

        System.out.println("\n >> Pes Quadrados = " + resposta + " \n");
        System.out.println(conversao.converterAreaPes());

        System.out.println("\n >> Centimetros Quadrados = " + resposta + " \n");
        System.out.println(conversao.converterAreaCentimetros());

        System.out.println("\n >> Acres Quadrados = " + resposta + " \n");
        System.out.println(conversao.converterAreaAcres());

        System.out.println("\n >> Milhas Quadrados = " + resposta + " \n");
        System.out.println(conversao.converterAreaMilhas());
    }
}

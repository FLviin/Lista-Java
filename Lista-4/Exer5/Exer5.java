package Exer5;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {

        Equacao equacao = new Equacao();

        Scanner leia = new Scanner(System.in);
        double a, b, c;

        System.out.print(" Entre com valor de A: ");
        a = leia.nextDouble();

        System.out.print(" Entre com valor de B: ");
        b = leia.nextDouble();

        System.out.print(" Entre com valor de C: ");
        c = leia.nextDouble();

        System.out.print("\n Raizes: [x' ; x''] = ");
        Equacao.imprimir(Equacao.equacaoSegundoGrau(a, b, c));
    }
}

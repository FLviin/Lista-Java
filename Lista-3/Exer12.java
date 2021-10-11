import java.util.Scanner;
import java.util.Arrays;

public class Exer12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.print("Entre com o valor: ");
            valor = leia.nextInt();
            if (valor < 1) {
                System.out.print("Erro! Valor invalido");
            }
        } while (valor < 1);

        System.out.print(" Sequência >> " + metodo(valor));
    }

    static String metodo(int valor) {
        String sequencia = "";
        int aux, soma;
        for (int i = 1; i <= valor; i++) {
            aux = i;
            soma = 0;
            for (int j = 1; j < aux; j++) {
                if (aux % j == 0) {
                    soma += j;
                }
            }
            if (aux == soma) {
                sequencia += aux + " ";
            }
        }
        return sequencia;
    }
}
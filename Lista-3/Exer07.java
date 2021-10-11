import java.util.Arrays;
import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valores[] = new int[2];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf(" Entre com valor %d: ", i + 1);
            valores[i] = leia.nextInt();
        }

        Arrays.sort(valores);
        int valor1 = valores[0];
        int valor2 = valores[1];

        System.out.println("O valor do MDC eh: " + mdc(valor1, valor2));

    }

    static int mdc(int valor1, int valor2) {
        int div = 2, cont = 1, c = 0;

        while (valor1 != 1 || valor2 != 1) {

            System.out.println(valor1 + ", " + valor2 + " | " + div + "\n");

            if (valor1 % div == 0 && valor2 % div == 0) {
                cont = cont * div;
            }

            if (valor1 % div == 0)
                valor1 = valor1 / div;
            if (valor2 % div == 0)
                valor2 = valor2 / div;

            if (valor1 % div == 0 || valor1 % div == 0)
                div = 1;
            div++;
        }
        System.out.println(valor1 + ", " + valor2 + " | " + div + "\n");

        return cont;
    }
}

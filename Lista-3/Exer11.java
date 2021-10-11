import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Entre com um número: ");
            numero = leia.nextInt();
            if (numero < 1) {
                System.out.println(" Erro! Valor Inválido.");
            }
        } while (numero < 1);

        System.out.println("O número " + numero + (numeroPerfeito(numero) ? " é Perfeito" : " Não é Perfeito"));
    }

    static boolean numeroPerfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        if (numero == soma) {
            return true;
        } else {
            return false;
        }
    }

}

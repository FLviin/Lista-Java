import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        DividirConta resultado = new DividirConta();

        double conta = 0.0;
        int pessoas = 0;
        String resposta;

        System.out.print(" Total da Conta: ");
        conta = leia.nextInt();
        System.out.print(" Quantidade de Pessoas: ");
        pessoas = leia.nextInt();
        System.out.print(" Pagar 10% do Garcom? [S/N]:  ");
        resposta = leiaStr.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print(" Total da Conta: " + conta + " para " + pessoas + " Pessoas");
            System.out.print("\n conta Dividida: " + resultado.contaDividida(conta, pessoas) + " R$ cada");
            double garcom = conta + (conta * 0.1);
            System.out.print("\n Total com 10% do Garcom: " + garcom);
        } else {
            System.out.print(" Total da Conta: " + conta + " para " + pessoas + " Pessoas");
            System.out.print("\n conta Dividida: " + resultado.contaDividida(conta, pessoas) + " R$ cada");
        }
    }
}

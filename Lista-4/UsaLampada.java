import java.util.Scanner;

public class UsaLampada {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Lampada lampada = new Lampada();
        String resposta;

        System.out.print("\nTestar Lampada [S/N]: ");
        resposta = leia.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Marca: " + lampada.getMarca());
            System.out.println("Modelo: " + lampada.getModelo());
            System.out.println("Tipo: " + lampada.getTipo());
            System.out.println("Estado: " + lampada.getEstado());
        } else {
            System.out.println("Marca: " + lampada.getMarca());
            System.out.println("Modelo: " + lampada.getModelo());
            System.out.println("Tipo: " + lampada.getTipo());
            System.out.println("Estado: " + lampada.getEstado2());
        }

    }
}

import java.util.Scanner;

public class Aluguel {
    Scanner sc = new Scanner(System.in);
    private boolean pagar;
    private boolean estaPago;
    
    public void alugarMidia(Midia midia, Cliente cliente) {
        System.out.println("A mídia" + midia.toString() + " foi alugador por " + cliente.toString());
        System.out.print("Deseja efeturar pagamento, " + cliente.getNome() + "? ");
        pagar = sc.nextBoolean();
        if(pagar) {
            cliente.pagar(midia.getValor());
            estaPago = true;
        } else {
            cliente.setDebito(midia.getValor());
            estaPago = false;
        }
    }

    public void devolverMidia(Midia midia, Cliente cliente) {
        if(estaPago) {
            System.out.println("Obrigado por alugar!");
        } else {
            do {
                System.out.printf(cliente.getNome() + " você tem um débito de R$ %.2f\n" + cliente.getDebito());
                System.out.print("Deseja efetuar pagamento, " + cliente.getNome() + "? ");
                pagar = sc.nextBoolean();
                if(pagar) {
                    cliente.pagar(midia.getValor());
                    cliente.setDebito(cliente.getDebito() - midia.getValor());
                    estaPago = true;
                } 
            } while(!estaPago);
        }
    }
    
}

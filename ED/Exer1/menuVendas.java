/**
 * main
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class menuVendas {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Scanner leiaNome = new Scanner(System.in);

        int opcao = 0;
        int r = 1;
        int pontos = 100;
        int ponto = 0;
        Boolean firstTime = false;

        ArrayList<CadastroDeVendas> vendas = new ArrayList<>();
        ArrayList<ListaPontos> listaPontos = new ArrayList<>();

        do{
            System.out.println();
            System.out.println(" == Menu de Vendas ==");
            System.out.println("0 - Cadastre Uma Venda ");
            System.out.println("1 - Vendedores ");
            System.out.println("2 - Vendas (Maior -> Menor) ");
            System.out.println("3 - Vendas Presenciais (Maior -> Menor) ");
            System.out.println("4 - Ranking E pontos (Vendas Presenciais) ");
            System.out.println("5 - Debitar Pontos");
            System.out.println("6 - Finalizar ");
            System.out.println();
            System.out.print("Opcao: ");
            opcao = leia.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Cadastre Uma Venda\n");

                    System.out.print("Nome: ");
                    String name = leiaNome.nextLine();

                    System.out.print("Valor: ");
                    double valor = leia.nextDouble();

                    int visitas;
                    boolean visita = false;

                    do{
                        System.out.print("Houve Visita?\n(1- SIM / 2- NAO): ");
                        visitas = leia.nextInt();

                        if(visitas <1 || visitas >2){
                            System.out.println("Opção Invalida !!");
                        }

                    }while (visitas <1 || visitas >2);
                    
                    if(visitas == 1){
                        visita = true;
                    }
                    vendas.add( new CadastroDeVendas(name , valor , visita));
                    
                break;

                case 1:
                System.out.println("Listagem 1: Vendedores que informaram suas vendas");
                    r = 1;
                    for (CadastroDeVendas cadastroDeVendas : vendas) {
                        System.out.println("("+r+") "+cadastroDeVendas.getName());
                        r++;
                    }    
                break;
                
                case 2:
                System.out.println("Listagem 2: Vendas da maior para a menor");
                   Collections.sort(vendas);
                   r = 1;
                   for (CadastroDeVendas cadastroDeVendas : vendas) {
                    System.out.println("("+r+") "+cadastroDeVendas.getName()+" ("+cadastroDeVendas.getValor()+" R$)");
                    r++;
                }
                break;
                case 3:
                System.out.println("Listagem 3: Vendas presenciais da maior para a menor");
                    Collections.sort(vendas);
                    r = 1;
                    for (CadastroDeVendas cadastroDeVendas : vendas) {
                        if(cadastroDeVendas.getVisita() == true){
                        System.out.println("("+r+") "+cadastroDeVendas.getName()+" ("+cadastroDeVendas.getValor()+" R$)");
                        r++;
                    }
                }
                
                break;
                case 4:
                System.out.println("Listagem 4: Ranking e Pontos das vendas presenciais");
                Collections.sort(vendas);
                
                    if(firstTime == false){
                        r = 1;
                        for (CadastroDeVendas cadastroDeVendas : vendas) {
                            if(cadastroDeVendas.getVisita() == true){
                                listaPontos.add(new ListaPontos(
                                    cadastroDeVendas.getName(),
                                    cadastroDeVendas.getValor(),
                                    pontos-(ponto * 10)
                                  )
                                );
                                System.out.println("("+r+") "+cadastroDeVendas.getName()+" ("+(pontos-(ponto * 10))+")" +" /"+  cadastroDeVendas.getValor());
                                ponto++;
                                r++;
                            }
                            
                        }
                        firstTime = true;
                    }else{
                        System.out.println("Semana Fechada");
                        r = 1;
                        for(ListaPontos rankingSemana : listaPontos){
                            System.out.println("("+r+") "+rankingSemana.getName()+" ("+rankingSemana.getPontos()+")" );
                            r++;
                        }
                    }
                    
                break;
                case 5:
                    if(firstTime == true){
                        System.out.println(" == Debitar Pontos ==");
                        System.out.println("Para Debitar Digite seu Nome: ");
                        name = leiaNome.nextLine();

                        for(int i =0; i < listaPontos.size(); i++){
                            if(listaPontos.get(i).getName().equals(name)){
                                System.out.println("Quantos Pontos irá debitar de ("+listaPontos.get(i).getName() + ") \n-> ");
                                int resp = leia.nextInt();

                                int result = listaPontos.get(i).getPontos() - resp;

                                if(result > 0){
                                    listaPontos.get(i).setPontos(result);
                                    System.out.println(" == Resultado == \n " +listaPontos.get(i).getName() + " ("+listaPontos.get(i).getPontos()+")");
                                }else{
                                    System.out.println(listaPontos.get(i).getName() + " Consegui resgatar " + listaPontos.get(i).getPontos() + ", " + (result * (-1)) + " não foram resgatados por falta de saldo.");
                                    listaPontos.get(i).setPontos(result);
                                    System.out.println(listaPontos.get(i).getName() + "("+listaPontos.get(i).getPontos()+")");
                                    listaPontos.remove(i);
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Semana Não Fechada");
                    }
                break;
                case 6:
                    System.out.println("Programa Finalizado !!");
                break;
            
                default: System.out.println("Opção Invalida !!");
            }
        }while(opcao !=6);

        leia.close();
        leiaNome.close();
    }
}
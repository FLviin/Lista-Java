
public class CadastroDeVendas implements Comparable<CadastroDeVendas> {

    private String name ;
    private double valor;
    private boolean visita;

    public CadastroDeVendas(){
        this.name = "";
        this.valor = 0.0;
        this.visita = false;
    }
    
    public CadastroDeVendas(String name, Double valor , Boolean visita){
        setName (name);
        setValor(valor);
        setVisita(visita);
    }
    //setters
    public void setName (String name){
        this.name = name;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    public void setVisita(Boolean visita){
        this.visita = visita;
    }

    //geters
    public String getName (){
        return name;
    }
    public Double getValor(){
        return valor;
    }
    public Boolean getVisita(){
        return visita;
    }

    @Override
    public int compareTo(CadastroDeVendas outraVenda) { 
        if (this.valor > outraVenda.getValor()) { 
          return -1; 
          } if (this.valor < outraVenda.getValor()) { 
          return 1; 
          } 
          return 0; 
         }

}
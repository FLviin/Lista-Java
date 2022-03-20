public class Doces extends Produto {

    private String tipoDoce ;
    
    public Doces (){
        super();
        this.tipoDoce = "";
    }
    
    public Doces (Double quantidadeDoce, String tipoDoce){
        super( quantidadeDoce );
        setTipo (tipoDoce);
        setPreco(2.0);
        Pedido.total += getPreco() * quantidadeDoce;
    }
    
        //setters
    public void setTipo ( String tipoDoce){
            this.tipoDoce = tipoDoce;
    }
       
    
        //getters
    public String getTipo(String tipoDoce){
        return tipoDoce;
        }
    
    @Override
    public String toString () {
            
        return "Doce -> Tipo: "+ tipoDoce +", Quantidade: "+ getQuantidade()+ ", Preço: "+(getPreco()) * getQuantidade();
    }
    
}

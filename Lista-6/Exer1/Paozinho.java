public class Paozinho extends Produto {

    private String tipoPao ;
    
    public Paozinho (){
        super();
        this.tipoPao = "";
    }
    
    public Paozinho (Double quantidadePao, String tipoPao){
        super( quantidadePao );
        setTipo (tipoPao);
        setPreco(1.5);
        Pedido.total += getPreco() * quantidadePao;
    }
    
        //setters
    public void setTipo ( String tipoPao){
            this.tipoPao = tipoPao;
    }
       
    
        //getters
    public String getTipo(String tipoPao){
        return tipoPao;
        }
    
    @Override
    public String toString () {
            
        return "Paozinho -> Tipo: "+ tipoPao +", Quantidade: "+ getQuantidade()+ ", Preço: "+(getPreco()) * getQuantidade();
    }
}

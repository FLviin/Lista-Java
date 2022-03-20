public class Frios extends Produto {
    
    private String tipo ;

    public Frios (){
        super();
        this.tipo = "";
    }

    public Frios (Double quantidade, String tipo){
        super( quantidade );
        setTipo (tipo);
        setPreco(5.0);
        Pedido.total += getPreco() * quantidade;
    }

    //setters
    public void setTipo ( String tipo){
         this.tipo = tipo;
    }
   

    //getters
    public String getTipo(String tipo){
        return tipo;
    }

    @Override
	public String toString () {
		
		return "Frios -> Tipo: "+ tipo +", Quantidade: "+ getQuantidade()+ ", Preço: "+(getPreco()) * getQuantidade();
	}
}

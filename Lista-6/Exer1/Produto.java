/**
 * Produto
 */
public class Produto {
   
    private double preco;
    private double quantidade;

    public Produto(){
        this.preco = 0.0;
        this.quantidade = 0.0;
    }
    public Produto(Double quantidade){
        setQuantidade(quantidade);
    }
    //setters
    public void setPreco ( double preco){
        this.preco = preco;
    }
    public void setQuantidade (double quantidade){
        this.quantidade = quantidade;
    }
    //getters
    public Double getPreco(){
        return preco;
    }
    public Double getQuantidade(){
        return quantidade;
    }
}
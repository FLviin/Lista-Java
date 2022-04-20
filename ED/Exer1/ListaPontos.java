public class ListaPontos {
    
    private String nome;
    private double valor;
    private int pontos;

    public ListaPontos(){
        this.nome = "";
        this.valor = 0.0;
        this.pontos = 0;
    }


    public ListaPontos(String nome, Double valor , int pontos){
        setName (nome);
        setValor(valor);
        setPontos(pontos);
    }

    //setters
    public void setName (String nome){
        this.nome = nome;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    public void setPontos(int pontos){
        if(pontos <= 0 ){
            this.pontos = 0;
        }else{
            this.pontos = pontos;
        } 
    }

    //geters
    public String getName (){
        return nome;
    }
    public Double getValor(){
        return valor;
    }
    public int getPontos(){
        return pontos;
    }
    
}
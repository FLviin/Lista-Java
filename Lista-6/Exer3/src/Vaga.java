public class Vaga {
    private String descricao;
    private double salarioOferecido;
    private static String inscricoes;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setSalarioOferecido(double salarioOferecido) {
        this.salarioOferecido = salarioOferecido;
    } 

    public double getSalarioOferecido() {
        return salarioOferecido;
    }

    public static void setInscricoes(String inscricoes) {
        inscricoes += inscricoes;
    }

    public static String getInscricoes() {
        return inscricoes;
    }

    public static void inscreverCandidato(Candidato candidato, Vaga vaga) {
        System.out.println("O candidato a seguir " + candidato.toString() + "foi inscrito na vaga abaixo: " + vaga.toString());
        setInscricoes(String.format(candidato.getNome() + "X" + vaga.getDescricao() + "\n"));
    }
    
    @Override
    public String toString() {
        return String.format("\nDescrição: %s\nSalário oferecido: %.2f\n", getDescricao(), getSalarioOferecido());
    }

}

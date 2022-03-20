public class Aluno extends Pessoa {
    private String curso;
    private double mensalidade;

    public Aluno() {}

    public Aluno(String nome, int idade, String curso, double mensalidade) {
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Curso: %s\nMensalidade: %.2f\n", getCurso(), getMensalidade());
    }

}

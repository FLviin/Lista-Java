public class Professor extends Pessoa {
    private String[] disciplina = new String[3];
    private double salario;

    public Professor() {}

    public Professor(String nome, int idade, String[] disciplinas, double salario) {
        super(nome, idade);
        this.salario = salario;
        for(int i = 0; i < disciplinas.length; i++) {
            this.disciplina[i] = disciplinas[i];
        }
    }

    public void setDisciplina(String disciplina) {
        for (int i = 0 ; i < this.disciplina.length ; i++) {
            if (this.disciplina[i] == null) {
            this.disciplina[i] = disciplina;
            return;
            }
        } 
    }

    public String getDisciplina(int indice) {
        return disciplina[indice];
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Salário: %.2f\n", getSalario());
    }

}

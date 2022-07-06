package L6.EX4;

public class Professor extends Pessoa {
    private Disciplina[] disciplinasLecionadas;

    public Professor(String nome, Integer idade, String endereco) {
        super(nome, idade, endereco);
        this.disciplinasLecionadas = new Disciplina[5];
    }

    public Professor(String nome, Integer idade, String endereco, Integer limiteDeLecionadas) {
        super(nome, idade, endereco);
        this.disciplinasLecionadas = new Disciplina[limiteDeLecionadas];
    }

    public Disciplina[] getDisciplinasLecionadas() {
        return this.disciplinasLecionadas;
    }

    public void setDisciplinasLecionadas(Disciplina[] disciplinasLecionadas) {
        this.disciplinasLecionadas = disciplinasLecionadas;
    }

    public String adicionaDisciplina(Disciplina disciplina) {
        int i = 0;
        for (i = 0; i < this.disciplinasLecionadas.length; i++) {
            if (this.disciplinasLecionadas[i] == null) {
                this.disciplinasLecionadas[i] = disciplina;
                return "Disciplina " + disciplina.getNome() + " adicionada à lista de lecionadas.";
            }
        }

        return "Não é possível lecionar mais disciplinas";
    }
}

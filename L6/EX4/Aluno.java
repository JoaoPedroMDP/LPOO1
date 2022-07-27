package L6.EX4;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private Integer periodo;
    private Disciplina[] disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso, Integer periodo, Integer idade,
            Integer quantidadeDisciplinasPermitidas, String endereco) {
        super(nome, idade, endereco);

        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.disciplinasMatriculadas = new Disciplina[quantidadeDisciplinasPermitidas];
    }

    public String fazMatricula(Disciplina disciplina) {
        if (this.disciplinasMatriculadas.length == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }

        for (Integer i = 0; i < this.disciplinasMatriculadas.length; i++) {
            if (this.disciplinasMatriculadas[i] == null) {
                Disciplina novaDisciplina = new Disciplina(disciplina.getNome());
                this.disciplinasMatriculadas[i] = novaDisciplina;
                return "Matricula na disciplina " + disciplina.getNome() + " executada.";
            }
        }

        return "Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de "
                + this.disciplinasMatriculadas.length
                + " disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
    }

    public String cancelarMatricula(Disciplina disciplina) {
        System.out.println("Removendo [" + disciplina.getNome() + "]");
        for (Integer i = 0; i < this.disciplinasMatriculadas.length; i++) {
            if (this.disciplinasMatriculadas[i].getNome().equals(disciplina.getNome())) {
                this.disciplinasMatriculadas[i] = null;
                return "Cancelamento da matrícula da disciplina " + disciplina.getNome() + " executado com sucesso.";
            }
        }

        return "Aluno não está matriculado na disciplina " + disciplina.getNome()
                + ", portanto não é possível cancelar esta matrícula.”";
    }

    public void imprime() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Período: " + this.periodo);
        System.out.println("Disciplinas Matriculadas:" + this.escreveDisciplinas());
        System.out.println("-----------------------------------------------------------------");
    }

    public String escreveDisciplinas() {
        String disciplinas = "";
        for (Integer i = 0; i < this.disciplinasMatriculadas.length; i++) {
            if (this.disciplinasMatriculadas[i] != null) {
                disciplinas += " " + this.disciplinasMatriculadas[i].getNome() + ";";
            }
        }

        return disciplinas;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Disciplina[] getDisciplinasMatriculadas() {
        return this.disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(Disciplina[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

}
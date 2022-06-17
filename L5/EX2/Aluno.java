package L5.EX2;

public class Aluno{
    private String nome;
    private String matricula;
    private String curso;
    private Integer periodo;
    private Integer idade;
    private String[] disciplinasMatriculadas;
    private String endereco;
    
    public Aluno(String nome, String matricula, String curso, Integer periodo, Integer idade, Integer quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidas];
    }

    public String fazMatricula(String disciplina){
        if(this.disciplinasMatriculadas.length == 0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
        }

        for(Integer i = 0; i < this.disciplinasMatriculadas.length; i++){
            if(this.disciplinasMatriculadas[i] == null){
                this.disciplinasMatriculadas[i] = disciplina;
                return "Matricula na disciplina "+ disciplina +" executada.";
            }
        }

        return "Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de "+this.disciplinasMatriculadas.length+" disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
    }

    public String cancelarMatricula(String disciplina){
        System.out.println("Removendo [" + disciplina + "]");
        for(Integer i = 0; i < this.disciplinasMatriculadas.length; i++){
            if(this.disciplinasMatriculadas[i].equals(disciplina)){
                this.disciplinasMatriculadas[i] = null;
                return "Cancelamento da matrícula da disciplina "+disciplina+" executado com sucesso.";
            }
        }

        return "Aluno não está matriculado na disciplina " +disciplina+ ", portanto não é possível cancelar esta matrícula.”";
    }

    public void imprime(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Período: " + this.periodo);
        System.out.println("Disciplinas Matriculadas:" + this.escreveDisciplinas());
        System.out.println("-----------------------------------------------------------------");
    }

    public String escreveDisciplinas(){
        String disciplinas = "";
        for(Integer i = 0; i < this.disciplinasMatriculadas.length; i++){
            if(this.disciplinasMatriculadas[i] != null){
                disciplinas += " " + this.disciplinasMatriculadas[i] + ";";
            }
        }
        
        return disciplinas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String[] getDisciplinasMatriculadas() {
        return this.disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

}
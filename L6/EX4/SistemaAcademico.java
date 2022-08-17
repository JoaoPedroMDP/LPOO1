package L6.EX4;

import java.util.ArrayList;
import java.util.Collection;

public class SistemaAcademico {
    Integer quantidadeAlunos = 0, quantidadedeProfessores = 0;
    CustomScanner sc = new CustomScanner();

    public void mostraMenu() {
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Excluir Aluno por nome");
        System.out.println("3 - Listar Alunos");
        System.out.println("4 - Matricular aluno em disciplina");
        System.out.println("5 - Cancelar matrícula");
        System.out.println("6 - Imprimir lista Alunos e Disciplinas matriculadas");
        System.out.println("7 - Cadastra professor");
        System.out.println("8 - Adiciona disciplina a um professor");
        System.out.println("9 - Lista professores e disciplinas");
    }

    public void sistema() {
        System.out.println("Bem vindo ao Sistema Acadêmico");

        System.out.println("Digite quantos alunos serão cadastrados: ");
        this.quantidadeAlunos = this.sc.nextInt();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        System.out.println("Digite quantos professores serão cadastrados: ");
        this.quantidadedeProfessores = this.sc.nextInt();
        ArrayList<Professor> professores = new ArrayList<Professor>();

        int opcao = 0;
        do {
            mostraMenu();
            try {
                opcao = this.sc.nextInt();
                System.out.println("Opção escolhida: " + opcao);
                switch (opcao) {
                    case 0:
                        System.out.println("Saindo do Sistema Acadêmico");
                        break;
                    case 1:
                        System.out.println(cadastrarAluno(alunos));
                        break;
                    case 2:
                        System.out.println(excluirAluno(alunos));
                        break;
                    case 3:
                        System.out.println(listarAlunos(alunos));
                        break;
                    case 4:
                        System.out.println(matricularAluno(alunos));
                        break;
                    case 5:
                        System.out.println(cancelarMatricula(alunos));
                        break;
                    case 6:
                        System.out.println(imprimirListaDeAlunoseDisciplinas(alunos));
                        break;
                    case 7:
                        System.out.println(cadastrarProfessor(professores));
                        break;
                    case 8:
                        System.out.println(adicionarDisciplinaAoProfessor(professores));
                        break;
                    case 9:
                        System.out.println(listarProfessoreseDisciplinas(professores));
                        break;
                }
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        this.sc.close();
    }

    private Aluno retornaAluno(ArrayList<Aluno> alunos, String nomeAluno) {
        for (Aluno a : alunos) {
            if (a.getNome().equals(nomeAluno)) {
                return a;
            }
        }

        return null;
    }

    public String cadastrarAluno(ArrayList<Aluno> alunos) {
        if (this.quantidadeAlunos == alunos.size()) {
            return "Limite de alunos atingido!";
        }

        System.out.println("Digite o nome do aluno: ");
        String nome = this.sc.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = this.sc.nextLine();
        System.out.println("Digite o curso do aluno: ");
        String curso = this.sc.nextLine();
        System.out.println("Digite o endereço do aluno: ");
        String endereco = this.sc.nextLine();
        System.out.println("Digite o período do aluno: ");
        Integer periodo = this.sc.nextInt();
        System.out.println("Digite a idade do aluno: ");
        Integer idade = this.sc.nextInt();
        System.out.println("Digite a quantidade de disciplinas permitidas para o aluno: ");
        Integer quantidadeDisciplinasPermitidas = this.sc.nextInt();

        Aluno aluno = new Aluno(nome, matricula, curso, periodo, idade, quantidadeDisciplinasPermitidas, endereco);

        alunos.add(aluno);
        return "Aluno cadastrado!";
    }

    public String excluirAluno(ArrayList<Aluno> alunos) {
        System.out.println("Digite o nome do aluno: ");
        String nome = this.sc.nextLine();

        Boolean removed = alunos.removeIf(a -> a.getNome().equals(nome));
        return removed ? "Aluno removido!" : "Aluno não encontrado!";
    }

    public String listarAlunos(ArrayList<Aluno> alunos) {
        alunos.forEach((a) -> a.imprime());
        return alunos.size() + " alunos listados.";
    }

    public String matricularAluno(ArrayList<Aluno> alunos) {
        System.out.println("Digite o nome do aluno: ");
        String nome = this.sc.nextLine();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = this.sc.nextLine();

        Disciplina disciplinaBuffer = new Disciplina();
        disciplinaBuffer.setNome(disciplina);
        for (Aluno a : alunos) {
            if (a.getNome().equals(nome)) {
                return a.fazMatricula(disciplinaBuffer);
            }
        }

        return "Aluno não encontrado";
    }

    public String cancelarMatricula(ArrayList<Aluno> alunos) {
        System.out.println("Digite o nome do aluno: ");
        String nome = this.sc.nextLine();
        Aluno aluno = retornaAluno(alunos, nome);
        if (aluno == null) {
            return "Aluno não encontrado.";
        }

        System.out.println("Digite a disciplina: ");
        String disciplina = this.sc.nextLine();
        Disciplina disciplinaBuffer = new Disciplina(disciplina);

        return aluno.cancelarMatricula(disciplinaBuffer);
    }

    public String imprimirListaDeAlunoseDisciplinas(ArrayList<Aluno> alunos) {
        String lista = "";

        for (Aluno a : alunos) {
            lista += "Nome: " + a.getNome() + "\nDisciplinas: " + a.escreveDisciplinas() + "\n";
        }

        return lista;
    }

    public String cadastrarProfessor(ArrayList<Professor> professores) {
        if (this.quantidadedeProfessores == professores.size()) {
            return "Limite de professores atingido!";
        }

        System.out.println("Digite o nome do professor: ");
        String nome = this.sc.nextLine();
        System.out.println("Digite a idade do professor: ");
        Integer idade = this.sc.nextInt();
        System.out.println("Digite o endereco do professor: ");
        String endereco = this.sc.nextLine();
        System.out.println("Digite a quantidade de disciplinas permitidas para o professor: ");
        Integer quantidadeDisciplinasPermitidas = this.sc.nextInt();

        Professor professor = new Professor(nome, idade, endereco, quantidadeDisciplinasPermitidas);

        professores.add(professor);

        return "Professor cadastrado!";
    }

    private String adicionarDisciplinaAoProfessor(ArrayList<Professor> professores) {
        System.out.println("Digite o nome do professor: ");
        String nome = this.sc.nextLine();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = this.sc.nextLine();

        Disciplina disciplinaBuffer = new Disciplina();
        disciplinaBuffer.setNome(disciplina);

        for (Professor p : professores) {
            if (p.getNome().equals(nome)) {
                return p.adicionaDisciplina(disciplinaBuffer);
            }
        }

        return "Professor não encontrado";
    }

    private String listarProfessoreseDisciplinas(ArrayList<Professor> professores) {
        for (Professor prof : professores) {
            if (prof != null) {
                prof.imprime();
            }
        }

        return professores.size() + " professores listados.";
    }
}
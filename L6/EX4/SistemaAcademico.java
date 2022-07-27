package L6.EX4;

public class SistemaAcademico {
    public static void mostraMenu() {
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Excluir Aluno por nome");
        System.out.println("3 - Listar Alunos");
        System.out.println("4 - Matricular aluno em disciplina");
        System.out.println("5 - Cancelar matrícula");
        System.out.println("6 - Imprimir lista Alunos e Disciplinas matriculadas");
        System.out.println("7 - Cadastra professor");
        System.out.println("8 - Adiciona disciplina a um professor");
    }

    public static void main(String[] args) {
        Integer quantidadeAlunos = 0, quantidadedeProfessores = 0;
        CustomScanner sc = new CustomScanner();
        System.out.println("Bem vindo ao Sistema Acadêmico");

        System.out.println("Digite quantos alunos serão cadastrados: ");
        quantidadeAlunos = sc.nextInt();
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        System.out.println("Digite quantos professores serão cadastrados: ");
        quantidadedeProfessores = sc.nextInt();
        Professor[] professores = new Professor[quantidadedeProfessores];

        int opcao = 0;
        do {
            mostraMenu();
            try{
                opcao = sc.nextInt();
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
                }    
            }catch(java.lang.NumberFormatException e){
                System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        sc.close();
    }

    private static Aluno retornaAluno(Aluno[] alunos, String nomeAluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nomeAluno)) {
                return alunos[i];
            }
        }

        return null;
    }

    public static String cadastrarAluno(Aluno[] alunos) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();
        System.out.println("Digite o curso do aluno: ");
        String curso = sc.nextLine();
        System.out.println("Digite o endereço do aluno: ");
        String endereco = sc.nextLine();
        System.out.println("Digite o período do aluno: ");
        Integer periodo = sc.nextInt();
        System.out.println("Digite a idade do aluno: ");
        Integer idade = sc.nextInt();
        System.out.println("Digite a quantidade de disciplinas permitidas para o aluno: ");
        Integer quantidadeDisciplinasPermitidas = sc.nextInt();

        Aluno aluno = new Aluno(nome, matricula, curso, periodo, idade, quantidadeDisciplinasPermitidas, endereco);

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                return "Aluno cadastrado";
            }
        }

        return "Não foi possível cadastrar o aluno";
    }

    public static String excluirAluno(Aluno[] alunos) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
                alunos[i] = null;
                return "Aluno removido";
            }
        }

        return "Aluno não encontrado";
    }

    public static Aluno[] listarAlunos(Aluno[] alunos) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                alunos[i].imprime();
            }
        }

        return alunos;
    }

    public static String matricularAluno(Aluno[] alunos) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = sc.nextLine();

        Disciplina disciplinaBuffer = new Disciplina();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
                disciplinaBuffer.setNome(disciplina);
                return alunos[i].fazMatricula(disciplinaBuffer);
            }
        }

        return "Aluno não encontrado";
    }

    public static String cancelarMatricula(Aluno[] alunos) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        Aluno aluno = retornaAluno(alunos, nome);
        if (aluno == null) {
            return "Aluno não encontrado.";
        }

        System.out.println("Digite a disciplina: ");
        String disciplina = sc.nextLine();
        Disciplina disciplinaBuffer = new Disciplina(disciplina);

        return aluno.cancelarMatricula(disciplinaBuffer);
    }

    public static String imprimirListaDeAlunoseDisciplinas(Aluno[] alunos) {
        String lista = "";
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                lista += "Nome: " + alunos[i].getNome() + "\nDisciplinas: " + alunos[i].escreveDisciplinas() + "\n";
            }
        }

        return lista;
    }

    public static String cadastrarProfessor(Professor[] professores) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do professor: ");
        Integer idade = sc.nextInt();
        System.out.println("Digite o endereco do professor: ");
        String endereco = sc.nextLine();
        System.out.println("Digite a quantidade de disciplinas permitidas para o professor: ");
        Integer quantidadeDisciplinasPermitidas = sc.nextInt();

        Professor professor = new Professor(nome, idade, endereco, quantidadeDisciplinasPermitidas);

        for(int i = 0; i < professores.length; i++) {
            if(professores[i] == null) {
                professores[i] = professor;
                return "Professor cadastrado";
            }
        }

        return "Não foi possível cadastrar o professor";
    }

    private static String adicionarDisciplinaAoProfessor(Professor[] professores) {
        CustomScanner sc = new CustomScanner();
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = sc.nextLine();

        Disciplina disciplinaBuffer = new Disciplina();
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null && professores[i].getNome().equals(nome)) {
                disciplinaBuffer.setNome(disciplina);
                professores[i].adicionaDisciplina(disciplinaBuffer);
                return "Disciplina adicionada";
            }
        }

        return "Professor não encontrado";
    }
}
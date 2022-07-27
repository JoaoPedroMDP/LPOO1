package L4.EX2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Nome da pessoa", "Rua Endereco da Pessoa", 22);

        pessoa.imprime();
        System.out.println("Executando 4 aniversários");
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.imprime();
    }
}
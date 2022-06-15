package L4.EX1;

public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Nome da pessoa", "Rua Endereco da Pessoa", 22);

        pessoa.imprime();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.imprime();
    }
}
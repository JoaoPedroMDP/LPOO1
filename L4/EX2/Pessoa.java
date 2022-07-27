package L4.EX2;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String endereco;

    public Pessoa(String nome, String endereco, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer novaIdade) {
        this.idade = novaIdade;
    }

    public void fazAniversario() {
        System.out.println("Parabéns.");
        this.idade++;
    }

    public void imprime() {
        System.out.printf("Nome: %s\nIdade: %d\nEndereço: %s\n", this.nome, this.idade, this.endereco);
    }
}
package L6.EX3;

public class SistemaRH {
    public static void main(String[] args){

    }

    public static void imprimeRelatorio(Funcionario[] funcionarios){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.getNome() + " - " + funcionario.getSalario() + " - " + funcionario.getBonus());
        }
    }
}

package L6.EX3;

public class Analista extends Funcionario {

    public Analista(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus() {
        return this.salario;
    }
    
}

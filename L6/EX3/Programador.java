package L6.EX3;

public class Programador extends Funcionario {

    public Programador(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.8;
    }
    
    
}

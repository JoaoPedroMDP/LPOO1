package L7.EX6;

public class AuxiliarLimpeza extends Funcionario {

    public AuxiliarLimpeza(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.5;
    }

}

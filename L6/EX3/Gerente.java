package L6.EX3;

import java.util.ArrayList;

public class Gerente extends Funcionario {
    private ArrayList<Funcionario> funcionarios;

    public Gerente(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus(){
        return this.salario * 2 + 100 * this.funcionarios.size();
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }

    public void adicionaFuncionario(Funcionario novoFuncionario){
        this.funcionarios.add(novoFuncionario);
    }
}

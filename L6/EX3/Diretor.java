package L6.EX3;

import java.util.ArrayList;

public class Diretor extends Funcionario {
    private ArrayList<Departamento> departamentos;

    public Diretor(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 4 + this.departamentos.size() * 30000;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return this.departamentos;
    }
}

package L7.EX6;

import java.util.ArrayList;

public class Diretor extends Funcionario {
    private ArrayList<Departamento> departamentos;

    public Diretor(double salario, String nome, ArrayList<Departamento> departamentos) throws NumDeptInvalido {
        super(salario, nome);
        this.setDepartamentos(departamentos);
    }

    public Diretor(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double getBonus() {
        return this.salario * 4 + this.departamentos.size() * 30000;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) throws NumDeptInvalido {
        if (departamentos.size() < 2) {
            throw new NumDeptInvalido();
        }
        this.departamentos = departamentos;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return this.departamentos;
    }
}

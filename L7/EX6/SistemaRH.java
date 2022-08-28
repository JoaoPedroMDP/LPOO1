package L7.EX6;

import java.util.ArrayList;

public class SistemaRH {
    public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>() {
            {
                add(new Departamento("Departamento 1"));
            }
        };
        Diretor diretor = new Diretor(1000d, "Diretor");
        SistemaRH.setaDeptos(departamentos, diretor);
        departamentos.add(new Departamento("Departamento 2"));
        departamentos.add(new Departamento("Departamento 3"));
        departamentos.add(new Departamento("Departamento 4"));
        SistemaRH.setaDeptos(departamentos, diretor);

        AuxiliarLimpeza auxiliarLimpeza = new AuxiliarLimpeza(1000d, "Auxiliar limpeza");
        Programador programador = new Programador(1000d, "Programador");
        Analista analista = new Analista(1000d, "Analista");
        Gerente gerente = new Gerente(1000d, "Gerente");
        ArrayList<Funcionario> funcionariosGer = new ArrayList<Funcionario>() {
            {
                add(auxiliarLimpeza);
                add(auxiliarLimpeza);
                add(programador);
            }
        };
        SistemaRH.setaFuncionarios(funcionariosGer, gerente);
        funcionariosGer.add(analista);
        funcionariosGer.add(programador);
        SistemaRH.setaFuncionarios(funcionariosGer, gerente);

        Funcionario[] funcionarios = { auxiliarLimpeza, programador, analista, gerente, diretor };

        imprimeRelatorio(funcionarios);
    }

    public static void imprimeRelatorio(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out
                    .println(funcionario.getNome() + " - " + funcionario.getSalario() + " - " + funcionario.getBonus());
        }
    }

    public static void setaFuncionarios(ArrayList<Funcionario> funcionarios, Gerente gerente) {
        try {
            gerente.setFuncionarios(funcionarios);
        } catch (TamEquipeInvalido e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setaDeptos(ArrayList<Departamento> departamentos, Diretor diretor) {
        try {
            diretor.setDepartamentos(departamentos);
        } catch (NumDeptInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}

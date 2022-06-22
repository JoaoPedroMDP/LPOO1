package L6.EX3;

import java.util.ArrayList;

public class SistemaRH {
    public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>() {
            {
                add(new Departamento("Departamento 1"));
                add(new Departamento("Departamento 2"));
                add(new Departamento("Departamento 3"));
                add(new Departamento("Departamento 4"));
            }
        };

        Diretor diretor = new Diretor(1000d, "Diretor");
        diretor.setDepartamentos(departamentos);

        AuxiliarLimpeza auxiliarLimpeza = new AuxiliarLimpeza(1000d, "Auxiliar limpeza");
        Programador programador = new Programador(1000d, "Programador");
        Analista analista = new Analista(1000d, "Analista");
        Gerente gerente = new Gerente(1000d, "Gerente");
        gerente.setFuncionarios(
                new ArrayList<Funcionario>() {
                    {
                        add(auxiliarLimpeza);
                        add(programador);
                        add(analista);
                    }
                });

        Funcionario[] funcionarios = { auxiliarLimpeza, programador, analista, gerente, diretor };

        imprimeRelatorio(funcionarios);
    }

    public static void imprimeRelatorio(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out
                    .println(funcionario.getNome() + " - " + funcionario.getSalario() + " - " + funcionario.getBonus());
        }
    }
}

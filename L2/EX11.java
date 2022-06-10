package L2;
import java.util.Scanner;

public class EX11 {
    private static Float calculate(Float salario, Float porcentagemSalario, Float bonus, Float quantidadeBonus){
        Float bonusAnual = salario * porcentagemSalario;
        if(bonus > 0){
            bonusAnual += bonus * quantidadeBonus;
        }

        return bonusAnual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cargo: ");
        String cargo = sc.nextLine();
        System.out.println("Digite o salario: ");
        Float salario = Float.parseFloat(sc.nextLine());
        System.out.println("  Cargo: " + cargo + "\n  Salario: " + salario);

        switch (cargo) {
            case "Diretor":
                System.out.println("Digite o numero de departamentos: ");
                Integer numDepartamentos = sc.nextInt();
                System.out.println(calculate(salario, 4f, 3000f, (float) numDepartamentos));
                break;
            case "Gerente":
                System.out.println("Digite o numero de funcionarios: ");
                Integer numFuncionarios = sc.nextInt();
                System.out.println(calculate(salario, 2f, 100f, (float) numFuncionarios));
                break;
            case "Analista":
                System.out.println(calculate(salario, 1f, 0f, 0f));
                break;
            case "Programador":
                System.out.println(calculate(salario, 0.8f, 0f, 0f));
                break;
            case "Auxiliar de Limpeza":
                System.out.println(calculate(salario, 0.5f, 0f, 0f));
                break;
        }
        sc.close();
    }
}
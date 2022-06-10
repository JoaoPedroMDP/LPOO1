package L2;
import java.util.Scanner;

public class EX11 {
    /**
     * @author João Pedro Martins de Paula
     * @version 1.0
     * @param (Float)salario Salario do funcionario
     * @param (Float)porcentagemSalario Porcentagem do salario a ser aplicada
     * @param (Float)bonus Bonus por outros motivos 
     * @param (Float)quantidadeBonus Vezes que o bonus acima sera aplicado
     */
    private static Float calculate(Float salario, Float porcentagemSalario, Float bonus, Float quantidadeBonus){
        Float bonusAnual = salario * porcentagemSalario;
        if(bonus > 0){
            bonusAnual += bonus * quantidadeBonus;
        }

        return bonusAnual;
    }

    /**
     * @author João Pedro Martins de Paula
     * @version 1.0
     * @param args argumentos
     */
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

public class EX10 {
    /**
     * @author João Pedro Martins de Paula
     * @version 1.0
     * @param args argumentos
     */
    public static void main(String[] args) {
        float atual = Float.parseFloat(args[0]), meta = Float.parseFloat(args[1]);

        System.out.printf("Sera necessario perder %.1f%% do seu peso atual\n", ((atual - meta) / atual) * 100);
    }
}